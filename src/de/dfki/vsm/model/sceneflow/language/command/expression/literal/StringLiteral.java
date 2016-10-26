package de.dfki.vsm.model.sceneflow.language.command.expression.literal;

//~--- non-JDK imports --------------------------------------------------------
import de.dfki.vsm.model.sceneflow.language.command.expression.LiteralExpression;
import de.dfki.vsm.util.TextFormat;
import de.dfki.vsm.util.ios.IOSIndentWriter;

import org.w3c.dom.Element;

/**
 * A string constant.
 *
 * @author Gregor Mehlmann
 */
public class StringLiteral extends LiteralExpression {

    private String mValue;

    public StringLiteral() {
        mValue = null;
    }

    public StringLiteral(java.lang.String value) {
        mValue = value;
    }

    public java.lang.String getValue() {
        return mValue;
    }

    public void setValue(java.lang.String value) {
        mValue = value;
    }

    @Override
    public ConstType getConstType() {
        return ConstType.STRING;
    }

    @Override
    public java.lang.String getAbstractSyntax() {
        return "String(" + getConcreteSyntax() + ")";
    }

    @Override
    public java.lang.String getConcreteSyntax() {
        return "\"" + mValue + "\"";
    }

    @Override
    public java.lang.String getFormattedSyntax() {
        return TextFormat.formatConstantStringLiteral("\"" + mValue + "\"");
    }

    @Override
    public StringLiteral getCopy() {
        return new StringLiteral(mValue);
    }

    @Override
    public void writeXML(IOSIndentWriter out) {
        out.println("<String value=\"" + mValue + "\"/>");
    }

    @Override
    public void parseXML(Element element) {
        mValue = element.getAttribute("value");
    }
}