// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;

public final class ImportFrom extends stmtType {
    public NameTokType module;
    public aliasType[] names;
    public int level;

    public ImportFrom(NameTokType module, aliasType[] names, int level) {
        this.module = module;
        this.names = names;
        this.level = level;
    }

    public ImportFrom(NameTokType module, aliasType[] names, int level, SimpleNode parent) {
        this(module, names, level);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public ImportFrom createCopy() {
        aliasType[] new0;
        if(this.names != null){
        new0 = new aliasType[this.names.length];
        for(int i=0;i<this.names.length;i++){
            new0[i] = (aliasType) (this.names[i] != null? this.names[i].createCopy():null);
        }
        }else{
            new0 = this.names;
        }
        ImportFrom temp = new ImportFrom(module!=null?(NameTokType)module.createCopy():null, new0,
        level);
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
        StringBuffer sb = new StringBuffer("ImportFrom[");
        sb.append("module=");
        sb.append(dumpThis(this.module));
        sb.append(", ");
        sb.append("names=");
        sb.append(dumpThis(this.names));
        sb.append(", ");
        sb.append("level=");
        sb.append(dumpThis(this.level));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitImportFrom(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (module != null){
            module.accept(visitor);
        }
        if (names != null) {
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null){
                    names[i].accept(visitor);
                }
            }
        }
    }

}
