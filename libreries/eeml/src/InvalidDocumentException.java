package eeml;

/**
 * 
 * This source code is based on proXML by Christian Riekoff (see http://www.texone.org/proxml/ for more info)
 * 
 * 
 * An InvalidDocumentException occurs when you try to load a file that does not contain XML.
 * Or the XML file you load has mistakes.
 * @nosuperclasses
 */

final class InvalidDocumentException extends Exception{

	public InvalidDocumentException () {
        super("This is not a parsable URL");
    }

    public InvalidDocumentException (String url) {
        super(url+" is not a parsable URL");
    }
    
    public InvalidDocumentException (String url, Exception i_exception) {
       super(url+" is not a parsable URL",i_exception);
   }

}
