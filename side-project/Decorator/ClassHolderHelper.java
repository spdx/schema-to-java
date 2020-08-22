package org.jibx.schema.codegen;
import org.eclipse.jdt.core.dom.AST;

public class ClassHolderHelper {

    public static AST getAST(ClassHolder holder) {
        return holder.getBuilder().getAST();
    }


}
