/**
 * 
 */
package com.imageprocess.model;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author vipul
 *
*/
@Component
public class UploadItem {

	private String fileName;
	private CommonsMultipartFile fileData;
	/**
	 * 
	 */
	public UploadItem() {
		// default constructor
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public CommonsMultipartFile getFileData() {
		return fileData;
	}
	public void setFileData(CommonsMultipartFile fileData) {
		this.fileData = fileData;
	}

}
