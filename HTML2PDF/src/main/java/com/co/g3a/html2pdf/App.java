package com.co.g3a.html2pdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public final static String  _HTML_TEMPLATE="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
			"<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n" + 
			"<head>\r\n" + 
			"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n" + 
			"<!--\r\n" + 
			"Guitar Template is provided by www.tooplate.com\r\n" + 
			"-->\r\n" + 
			"<title>Guitar Website Template</title>\r\n" + 
			"<meta name=\"keywords\" content=\"\" />\r\n" + 
			"<meta name=\"description\" content=\"\" />\r\n" + 
			"<link href=\"css/tooplate_style.css\" media=\"all\"  rel=\"stylesheet\" type=\"text/css\" />\r\n" + 
			"<link href=\"css/coda-slider.css\" media=\"all\"  rel=\"stylesheet\" type=\"text/css\" charset=\"utf-8\" />\r\n" + 
			"\r\n" + 
			"<script src=\"js/jquery-1.2.6.js\" type=\"text/javascript\"></script>\r\n" + 
			"<script src=\"js/jquery.scrollTo-1.3.3.js\" type=\"text/javascript\"></script>\r\n" + 
			"<script src=\"js/jquery.localscroll-1.2.5.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n" + 
			"<script src=\"js/jquery.serialScroll-1.2.1.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n" + 
			"<script src=\"js/coda-slider.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n" + 
			"<script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n" + 
			"\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"	\r\n" + 
			"    <div id=\"slider\">\r\n" + 
			"    <div id=\"tooplate_wrapper\">\r\n" + 
			"    	\r\n" + 
			"        <div id=\"tooplate_sidebar\">\r\n" + 
			"        \r\n" + 
			"            <div id=\"header\">\r\n" + 
			"                <h1><a href=\"#\"><img src=\"images/tooplate_logo.png\" alt=\"Guitar Template by tooplate.com\" title=\"Guitar Website Template\" /></a></h1>\r\n" + 
			"            </div>    \r\n" + 
			"			\r\n" + 
			"            <div id=\"menu\">\r\n" + 
			"                <ul class=\"navigation\">\r\n" + 
			"                    <li><a href=\"#home\" class=\"selected menu_01\">Home</a></li>\r\n" + 
			"                    <li><a href=\"#about\" class=\"menu_02\">About Us</a></li>\r\n" + 
			"                    <li><a href=\"#services\" class=\"menu_03\">Services</a></li>\r\n" + 
			"                    <li><a href=\"#gallery\" class=\"menu_04\">Gallery</a></li>\r\n" + 
			"                    <li><a href=\"#contact\" class=\"menu_05\">Contact</a></li>\r\n" + 
			"                </ul>\r\n" + 
			"            </div>\r\n" + 
			"		</div> <!-- end of sidebar -->\r\n" + 
			"    \r\n" + 
			"        <div id=\"content\">\r\n" + 
			"            <div class=\"scroll\">\r\n" + 
			"                <div class=\"scrollContainer\">\r\n" + 
			"                \r\n" + 
			"                    <div class=\"panel\" id=\"home\">\r\n" + 
			"                    	<div class=\"content_section\">\r\n" + 
			"                            <h2>Guitar Website Template</h2>    \r\n" + 
			"                            \r\n" + 
			"                            <img src=\"images/tooplate_image_01.jpg\" alt=\"Image 01\" class=\"image_wrapper image_fl\" />\r\n" + 
			"                            \r\n" + 
			"                            <p><em>Nullam at erat ipsum, quis tincidunt mauris. Nunc sit amet sapien eget eros iaculis hendrerit quis a enim. Vestibulum at leo ante, vel auctor velit.</em></p>	\r\n" + 
			"                            \r\n" + 
			"                            <p>Guitar is free HTML website template by <strong>tooplate</strong>. You may edit and apply this template for any purpose. Credits go to <a rel=\"nofollow\" href=\"http://www.photovaco.com\" target=\"_blank\">Free Photos</a>, <a rel=\"nofollow\" href=\"http://jwloh.deviantart.com/art/Aquaticus-Social-91014249\" target=\"_blank\">Aquaticus social icons</a> and <a rel=\"nofollow\" href=\"http://www.icojoy.com\" target=\"_blank\">Icojoy icons</a>.</p>\r\n" + 
			"                         </div>\r\n" + 
			"                         <div class=\"content_section last_section\">   \r\n" + 
			"                         	<h2>What We Do</h2>\r\n" + 
			"                                <ul class=\"service_list col_200 float_l\">\r\n" + 
			"                                    <li><a href=\"#\" class=\"service_one\">Morbi luctus cursus</a></li>\r\n" + 
			"                                    <li><a href=\"#\" class=\"service_two\">Pellent esque habit</a></li>\r\n" + 
			"                                    <li><a href=\"#\" class=\"service_three\">Duis at sapien</a></li>\r\n" + 
			"                                </ul>\r\n" + 
			"                                <ul class=\"service_list col_200 image_fr\">\r\n" + 
			"	                                <li><a href=\"#\" class=\"service_four\">In aliquet blandit</a></li> \r\n" + 
			"                                    <li><a href=\"#\" class=\"service_five\">Maecenas posuere</a></li>  \r\n" + 
			"                                    <li><a href=\"#\" class=\"service_six\">Ipsum ut pretium</a></li>\r\n" + 
			"								</ul>\r\n" + 
			"						</div>\r\n" + 
			"                    </div> <!-- end of home -->\r\n" + 
			"                    \r\n" + 
			"                    <div class=\"panel\" id=\"about\">\r\n" + 
			"                    	<div class=\"content_section\">\r\n" + 
			"                            <h1>About Us</h1>\r\n" + 
			"                            <img src=\"images/tooplate_image_02.jpg\" alt=\"Image 02\" class=\"image_wrapper image_fl\" />\r\n" + 
			"                            <p><em>Donec dignissim nulla ac enim gravida id fringilla dui varius. Vivamus eleifend interdum lorem in pharetra. Suspendisse vehicula neque vel nibh consectetur ut bibendum leo bibendum. </em></p>\r\n" + 
			"                            <p>Vestibulum vitae lectus a leo <a href=\"#\">commodo egestas</a>. Sed et ligula mauris. Donec interdum iaculis eros, sed porttitor justo ornare ac. Suspendisse ultrices arcu auctor sapien malesuada dictum. Vivamus non <a href=\"#\">ante sit amet</a> ligula dignissim blandit ut sit amet purus. Sed tristique euismod lectus sed scelerisque.</p>\r\n" + 
			"                            \r\n" + 
			"						</div>\r\n" + 
			"                        <div class=\"content_section last_section\">\r\n" + 
			"							<h2>Testimonial</h2>\r\n" + 
			"                            <blockquote>\r\n" + 
			"                            <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula, quis viverra tellus nulla a odio. Curabitur vitae enim risus, at placerat turpis. Mauris feugiat suscipit tempus fringilla, felis in velit.</p>\r\n" + 
			"                            \r\n" + 
			"                            <cite>Oliva - <span>Marketing Director</span></cite>\r\n" + 
			"                            </blockquote>\r\n" + 
			"                        </div>\r\n" + 
			"                    </div>\r\n" + 
			"                    \r\n" + 
			"                    <div class=\"panel\" id=\"services\">\r\n" + 
			"                        <h1>Services</h1>\r\n" + 
			"                        <img src=\"images/tooplate_image_02.jpg\" alt=\"Image 02\" class=\"image_wrapper image_fr\" />\r\n" + 
			"                        <p><em>Aenean dictum erat a nibh tempor varius malesuada orci gravida. Aenean tempor pharetra urna et accumsan. Nunc vitae nisl nisl.</em></p>\r\n" + 
			"                        \r\n" + 
			"                        <p>Proin porttitor viverra nisl, sed rutrum nunc blandit sit amet. Praesent vel nisl vitae mi pulvinar tempus vel tempus diam. Aenean quis pulvinar est. Duis sed orci porta urna consequat laoreet aliquet at mi.</p>\r\n" + 
			"                        <div class=\"cleaner_h20\"></div>\r\n" + 
			"                        <ul class=\"service_list\">\r\n" + 
			"                            <li><a href=\"#\" class=\"service_one\">Morbi luctus, quam vitae cursus tincidunt.</a></li>\r\n" + 
			"                            <li><a href=\"#\" class=\"service_two\">Pellentesque habitant morbi tristique senectus.</a></li>\r\n" + 
			"                            <li><a href=\"#\" class=\"service_three\">Duis at sapien ut sapien commodo molestie.</a></li>\r\n" + 
			"                            <li><a href=\"#\" class=\"service_four\">In aliquet blandit iaculis, et vitae elit libero.</a></li> \r\n" + 
			"                            <li><a href=\"#\" class=\"service_five\">Maecenas posuere fringilla ipsum ut pretium.</a></li>   \r\n" + 
			"                        </ul>\r\n" + 
			"                    </div>\r\n" + 
			"                \r\n" + 
			"                    <div class=\"panel\" id=\"gallery\">\r\n" + 
			"                        <h1>Our Gallery</h1>\r\n" + 
			"                        \r\n" + 
			"                        <ul id=\"gallery_container\">\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_01.jpg\" alt=\"Image 01\" /></a></li>\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_02.jpg\" alt=\"Image 02\" /></a></li>\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_03.jpg\" alt=\"Image 03\" /></a></li>\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_04.jpg\" alt=\"Image 04\" /></a></li>\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_05.jpg\" alt=\"Image 05\" /></a></li>\r\n" + 
			"                            <li><a href=\"#\"><img src=\"images/gallery/image_06.jpg\" alt=\"Image 06\" /></a></li>\r\n" + 
			"						</ul>\r\n" + 
			" \r\n" + 
			"                    </div>\r\n" + 
			"                \r\n" + 
			"                    <div class=\"panel\" id=\"contact\">\r\n" + 
			"                        <h1>Contact</h1>\r\n" + 
			"            \r\n" + 
			"                        <p>Mauris volutpat suscipit semper. Proin dolor justo, euismod ultrices tincidunt vitae, sodales eget lacus. Validate <a href=\"http://validator.w3.org/check?uri=referer\" rel=\"nofollow\"><strong>XHTML</strong></a> and <a href=\"http://jigsaw.w3.org/css-validator/check/referer\" rel=\"nofollow\"><strong>CSS</strong></a>.</p>\r\n" + 
			"                        \r\n" + 
			"                        <div class=\"cleaner_h10\"></div>\r\n" + 
			"                                                \r\n" + 
			"                        <div class=\"col_380 float_l\">\r\n" + 
			"                            <div id=\"contact_form\">\r\n" + 
			"                                <form method=\"post\" name=\"contact\" action=\"#\">\r\n" + 
			"					\r\n" + 
			"									<label for=\"author\">Name:</label> <input type=\"text\" id=\"author\" name=\"author\" class=\"required input_field\" />\r\n" + 
			"									<div class=\"cleaner_h10\"></div>\r\n" + 
			"																\r\n" + 
			"									<label for=\"email\">Email:</label> <input type=\"text\" class=\"validate-email required input_field\" name=\"email\" id=\"email\" />\r\n" + 
			"									<div class=\"cleaner_h10\"></div>\r\n" + 
			"														\r\n" + 
			"									<label for=\"subject\">Subject:</label> <input type=\"text\" class=\"validate-subject required input_field\" name=\"subject\" id=\"subject\"/>\r\n" + 
			"									<div class=\"cleaner_h10\"></div>\r\n" + 
			"										\r\n" + 
			"									<label for=\"text\">Message:</label> <textarea id=\"text\" name=\"text\" rows=\"0\" cols=\"0\" class=\"required\"></textarea>\r\n" + 
			"									<div class=\"cleaner_h10\"></div>				\r\n" + 
			"															\r\n" + 
			"									<input type=\"submit\" value=\"Send\" id=\"submit\" name=\"submit\" class=\"submit_btn float_l\" />\r\n" + 
			"									<input type=\"reset\" value=\"Reset\" id=\"reset\" name=\"reset\" class=\"submit_btn float_r\" />\r\n" + 
			"									\r\n" + 
			"								</form>\r\n" + 
			"                            </div>\r\n" + 
			"                        </div>\r\n" + 
			"                        \r\n" + 
			"                        <div class=\"col_380 float_r\">\r\n" + 
			"                        \r\n" + 
			"                        </div>\r\n" + 
			"                    </div>\r\n" + 
			"                    \r\n" + 
			"                </div>\r\n" + 
			"            </div>\r\n" + 
			"            <!-- end of scroll -->\r\n" + 
			"        </div>\r\n" + 
			"        <div class=\"cleaner\"></div>\r\n" + 
			"    </div> <!-- end of content -->\r\n" + 
			"    <div class=\"cleaner\"></div>\r\n" + 
			"</div>\r\n" + 
			"\r\n" + 
			"<div id=\"footer\">\r\n" + 
			"    \r\n" + 
			"        <div id=\"social_box\">\r\n" + 
			"            <a href=\"#\"><img src=\"images/facebook.png\" alt=\"facebook\" /></a>\r\n" + 
			"            <a href=\"#\"><img src=\"images/flickr.png\" alt=\"flickr\" /></a>\r\n" + 
			"            <a href=\"#\"><img src=\"images/myspace.png\" alt=\"myspace\" /></a>\r\n" + 
			"            <a href=\"#\"><img src=\"images/twitter.png\" alt=\"twitter\" /></a>\r\n" + 
			"            <a href=\"#\"><img src=\"images/youtube.png\" alt=\"youtube\" /></a>\r\n" + 
			"        </div>\r\n" + 
			"    \r\n" + 
			"        Copyright © 2048 <a href=\"#\">Company Name</a>\r\n" + 
			"		\r\n" + 
			"</div>\r\n" + 
			"\r\n" + 
			"</body>\r\n" + 
			"</html>";
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
