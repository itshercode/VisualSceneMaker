package de.dfki.vsm.model.sceneflow.language.command.expression;

import de.dfki.vsm.model.sceneflow.language.command.Expression;
import de.dfki.vsm.util.ios.IOSIndentWriter;
import de.dfki.vsm.util.xml.XMLParseAction;
import de.dfki.vsm.util.xml.XMLParseError;
import de.dfki.vsm.util.xml.XMLWriteError;
import java.util.ArrayList;
import java.util.concurrent.AbstractExecutorService;
import org.w3c.dom.Element;

/**
 *
 * @author Gregor Mehlmann
 */
public class FunctionExpression extends Expression {

    private String mName;
    private ArrayList<Expression> mArgList;

    public FunctionExpression() {
        mName = new String();
        mArgList = new ArrayList();
    }

    public FunctionExpression(String name) {
        mName = name;
        mArgList = new ArrayList();
    }

    public FunctionExpression(String name, ArrayList argList) {
        mName = name;
        mArgList = argList;
    }

    public String getName() {
        return mName;
    }

    public void setName(String value) {
        mName = value;
    }

    public ArrayList<Expression> getArgList() {
        return mArgList;
    }

    public void setArgList(ArrayList<Expression> value) {
        mArgList = value;
    }

    public int getSizeOfArgList() {
        return mArgList.size();
    }

    public ArrayList<Expression> getCopyOfArgList() {
        ArrayList<Expression> copy = new ArrayList();

        for (Expression exp : mArgList) {
            copy.add(exp.getCopy());
        }

        return copy;
    }

    public boolean addArg(Expression value) {
        return mArgList.add(value);
    }

    public Expression getArgAt(int index) {
        return mArgList.get(index);
    }

//    public ExpType getExpType() {
//        return ExpType.USR;
//    }
    @Override
    public String getAbstractSyntax() {
        String desc = "FunctionExpression( " + mName + "( ";

        for (int i = 0; i < mArgList.size(); i++) {
            desc += mArgList.get(i).getAbstractSyntax();

            if (i != mArgList.size() - 1) {
                desc += " , ";
            }
        }

        return desc + " ) )";
    }

    @Override
    public String getConcreteSyntax() {
        String desc = mName + " ( ";

        for (int i = 0; i < mArgList.size(); i++) {
            desc += mArgList.get(i).getConcreteSyntax();

            if (i != mArgList.size() - 1) {
                desc += " , ";
            }
        }

        return desc + " )";
    }

    @Override
    public String getFormattedSyntax() {
        String desc = "#b#" + mName + " ( ";

        for (int i = 0; i < mArgList.size(); i++) {
            desc += mArgList.get(i).getFormattedSyntax();

            if (i != mArgList.size() - 1) {
                desc += " , ";
            }
        }

        return desc + " ) ";
    }

    @Override
    public FunctionExpression getCopy() {
        return new FunctionExpression(mName, getCopyOfArgList());
    }

    @Override
    public void writeXML(IOSIndentWriter out) throws XMLWriteError {
        out.println("<FunctionExpression name=\"" + mName + "\">").push();

        for (int i = 0; i < mArgList.size(); i++) {
            mArgList.get(i).writeXML(out);
        }

        out.pop().println("</FunctionExpression>");
    }

    @Override
    public void parseXML(Element element) throws XMLParseError {
        mName = element.getAttribute("name");
        XMLParseAction.processChildNodes(element, new XMLParseAction() {
            @Override
            public void run(Element element) throws XMLParseError {
                Expression exp = Expression.parse(element);

                mArgList.add(exp);
            }
        });
    }
}