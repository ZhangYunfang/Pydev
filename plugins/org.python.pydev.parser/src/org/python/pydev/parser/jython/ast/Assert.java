// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class Assert extends stmtType {
    public exprType test;
    public exprType msg;

    public Assert(exprType test, exprType msg) {
        this.test = test;
        this.msg = msg;
    }

    public Assert(exprType test, exprType msg, SimpleNode parent) {
        this(test, msg);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public Assert createCopy() {
        Assert temp = new Assert(test!=null?(exprType)test.createCopy():null,
        msg!=null?(exprType)msg.createCopy():null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType);
                }
            }
        }
        if(this.specialsAfter != null){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType);
                }
            }
        }
        return temp;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Assert[");
        sb.append("test=");
        sb.append(dumpThis(this.test));
        sb.append(", ");
        sb.append("msg=");
        sb.append(dumpThis(this.msg));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitAssert(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null){
            test.accept(visitor);
        }
        if (msg != null){
            msg.accept(visitor);
        }
    }

}
