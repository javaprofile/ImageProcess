<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Upload File</title>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.Jcrop.min.js"/>"></script>
<script type="text/javascript">
  jQuery(function($){

    $('#target').Jcrop({
		onChange : showCoords,
		onSelect : showCoords
    })
  });

  function showCoords( image ) {
	  $("#length").val( image.x );
	  $("#width").val( image.w );
	  $("#height").val( image.h );
	  $("#t").val( image.y );
  }
</script>
<link rel="stylesheet" href="<c:url value="/resources/css/jquery.Jcrop.css"/>" type="text/css" />
</head>
<body>
	<form method="POST" action="uploadFile" enctype="multipart/form-data">
		File to upload: <input type="file" name="file"><br /> 
		Name: <input type="text" name="name"><br /> <br /> 
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
	<div>
	<c:if test="${ not empty message }">
		${message}
	</c:if>	
	</div>
	<div>
			<c:if test="${not empty imageName }">
			
			<img src="/images/${imageName}" id="target"/>
			</c:if>
	</div>
	<div>
			<c:if test="${not empty imageName }">
			<form method="POST" action="saveCropped">
				<input type="hidden" name="imageName" value="${imageName }"/>
				<input type="hidden" name="length" id="length" value=""/>
				<input type="hidden" name="width" id="width" value=""/>
				<input type="hidden" name="height" id="height" value=""/>
				<input type="hidden" name="t" id="t" value=""/>
				
				<input type="submit" value="Save Image"/>
			</form>
			</c:if>
	</div>
		
</body>
</html>