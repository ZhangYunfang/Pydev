// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class TryFinally extends stmtType {
    public stmtType[] body;
    public suiteType finalbody;

    public TryFinally(stmtType[] body, suiteType finalbody) {
        this.body = body;
        this.finalbody = finalbody;
    }

    public TryFinally(stmtType[] body, suiteType finalbody, SimpleNode parent) {
        this(body, finalbody);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public TryFinally createCopy() {
        stmtType[] new0;
        if(this.body != null){
        new0 = new stmtType[this.body.length];
        for(int i=0;i<this.body.length;i++){
            new0[i] = (stmtType) (this.body[i] != null? this.body[i].createCopy():null);
        }
        }else{
            new0 = this.body;
        }
        TryFinally temp = new TryFinally(new0,
        finalbody!=null?(suiteType)finalbody.createCopy():null);
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
        StringBuffer sb = new StringBuffer("TryFinally[");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("finalbody=");
        sb.append(dumpThis(this.finalbody));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitTryFinally(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null){
                    body[i].accept(visitor);
                }
            }
        }
        if (finalbody != null){
            finalbody.accept(visitor);
        }
    }

}
