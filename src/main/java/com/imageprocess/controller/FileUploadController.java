/**
 * 
 */
package com.imageprocess.controller;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.imageprocess.model.UploadItem;

/**
 * @author vipul
 *
 */
@Controller
public class FileUploadController extends BaseController {

	@Autowired
	ServletContext servletContext;
	/**
	 * 
	 */
	public FileUploadController() {
	}
	
	@RequestMapping( value="/uploadFileView", method=RequestMethod.GET )
	public String getUploadForm( Model model ) {
		
		model.addAttribute( new UploadItem() );
		return "uploadFile";
	}
	
	/**
	 * Upload  file
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadImageHandler( @RequestParam("file") MultipartFile file,
												HttpServletRequest request,
												ModelMap model) {
		String imageName = "";
		String message = "";
		String fullPath = "";
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = request.getServletContext().getRealPath("/");
				 fullPath = rootPath  + "images";
				File dir = new File(fullPath);
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				imageName = file.getOriginalFilename();
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + imageName );
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				

				message =  "You successfully uploaded file: " + imageName;
			} catch (Exception e) {
				message =  "You failed to upload " + imageName + " => " + e.getMessage();
			}
		} else {
			message =  "You failed to upload " + imageName
					+ " because the file was empty.";
		}
		
		model.addAttribute("imageName",imageName);
		model.addAttribute("message", message );
		return "uploadFile";
	}
	
	@RequestMapping(value = "/saveCropped", method = RequestMethod.POST)
	public String imageResize(@RequestParam int length,
								@RequestParam int width,
								@RequestParam int height,
								@RequestParam int t,
								@RequestParam String imageName,
								HttpServletRequest request,
								ModelMap model) {
		String rootPath = request.getServletContext().getRealPath("/");
		String fullPath = rootPath  + "images"+File.separator+imageName;
		System.out.println(fullPath);
		String ext = imageName.split("\\.")[1];
		BufferedImage outImage;
		try {
			outImage = ImageIO.read(new File(fullPath));
			BufferedImage cropped=outImage.getSubimage(length, t, width, height);
			ImageIO.write(cropped, ext, new File(fullPath)); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("imageName",imageName);
		model.addAttribute("message", "Cropped Successfully." );
		return "uploadFile";
	}

}
