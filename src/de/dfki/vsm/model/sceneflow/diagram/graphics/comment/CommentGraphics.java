package de.dfki.vsm.model.sceneflow.diagram.graphics.comment;

//~--- non-JDK imports --------------------------------------------------------

import de.dfki.vsm.model.sceneflow.SyntaxObject;
import de.dfki.vsm.util.ios.IOSIndentWriter;
import de.dfki.vsm.util.xml.XMLParseAction;
import de.dfki.vsm.util.xml.XMLParseError;

import org.w3c.dom.Element;

/**
 * The graphics information for an edge.
 *
 * @author Not me
 */
public class CommentGraphics extends SyntaxObject {
    private CommentBorder mRect;

    public CommentGraphics() {
        mRect = new CommentBorder();
    }

    public CommentGraphics(CommentBorder Rect) {
        mRect = Rect;
    }

    public void setRect(CommentBorder value) {
        mRect = value;
    }

    public CommentBorder getRect() {
        return mRect;
    }

    public String getAbstractSyntax() {
        return "Graphics(" + ((mRect != null)
                              ? mRect.getAbstractSyntax()
                              : "") + ")";
    }

    public String getConcreteSyntax() {
        return ((mRect != null)
                ? mRect.getConcreteSyntax()
                : "");
    }

    public String getFormattedSyntax() {
        return "";
    }

    public CommentGraphics getCopy() {
        return new CommentGraphics(mRect.getCopy());
    }

    public void writeXML(IOSIndentWriter out) {
        out.println("<Graphics>").push();
        mRect.writeXML(out);
        out.pop().println("</Graphics>");
    }

    public void parseXML(Element element) throws XMLParseError {
        XMLParseAction.processChildNodes(element, "Rect", new XMLParseAction() {
            public void run(Element element) throws XMLParseError {
                mRect.parseXML(element);
            }
        });
    }
}
