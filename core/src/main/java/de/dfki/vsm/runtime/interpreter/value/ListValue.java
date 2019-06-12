package de.dfki.vsm.runtime.interpreter.value;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Gregor Mehlmann
 */
public class ListValue extends AbstractValue {

    private final List<AbstractValue> mValueList;

    public ListValue(List<AbstractValue> valueList) {
        mValueList = valueList;
    }

    public List<AbstractValue> getValueList() {
        return mValueList;
    }

    public boolean isEmpty() {
        return mValueList.isEmpty();
    }

    public LinkedList<AbstractValue> getCopyOfValueList() {
        LinkedList<AbstractValue> valueListCopy = new LinkedList<>();

        for (AbstractValue value : mValueList) {
            valueListCopy.add(value.getCopy());
        }

        return valueListCopy;
    }

    @Override
    public Type getType() {
        return Type.LIST;
    }

    @Override
    public String getAbstractSyntax() {
        StringBuilder result = new StringBuilder("ListValue(");

        for (int i = 0; i < mValueList.size(); i++) {
            result.append(mValueList.get(i).getAbstractSyntax());

            if (i < mValueList.size() - 1) {
                result.append(",");
            }
        }

        return result + ")";
    }

    @Override
    public String getConcreteSyntax() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < mValueList.size(); i++) {
            result.append(mValueList.get(i).getConcreteSyntax());

            if (i < mValueList.size() - 1) {
                result.append(",");
            }
        }

        return result + "]";
    }

    @Override
    public String getFormattedSyntax() {
        StringBuilder result = new StringBuilder("[ ");

        for (int i = 0; i < mValueList.size(); i++) {
            result.append(mValueList.get(i).getFormattedSyntax());

            if (i < mValueList.size() - 1) {
                result.append(" , ");
            }
        }

        return result + " ]";
    }

    public Object[] getValue() {
        Object[] objArr = new Object[mValueList.size()];

        for (int i = 0; i < mValueList.size(); i++) {
            objArr[i] = mValueList.get(i).getValue();
        }

        return objArr;
    }

    public ListValue getCopy() {
        return new ListValue(getCopyOfValueList());
    }

    public boolean equalsValue(AbstractValue value) {
        return false;
    }
}