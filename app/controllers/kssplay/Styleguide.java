package controllers.kssplay;

import java.lang.reflect.Modifier;
import java.util.Set;

import play.Play;
import play.mvc.Controller;
import play.vfs.VirtualFile;

import com.revbingo.kss.KssParser;

public class Styleguide extends Controller {

    public static void index() {
    	String stylesheetLocation = Play.configuration.getProperty("stylesheets.dir", "public/stylesheets");
		KssParser parser = new KssParser(stylesheetLocation);
		Set<String> sections = parser.getSections().keySet();
        render(parser, sections);
    }
}