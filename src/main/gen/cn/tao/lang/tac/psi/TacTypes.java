// This is a generated file. Not intended for manual editing.
package cn.tao.lang.tac.psi;

import cn.tao.lang.psi.TacElementType;
import cn.tao.lang.psi.TacTokenType;
import cn.tao.lang.tac.psi.impl.TacPropertyImpl;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;


public interface TacTypes {

  IElementType PROPERTY = new TacElementType("PROPERTY");

  IElementType COMMENT = new TacTokenType("COMMENT");
  IElementType CRLF = new TacTokenType("CRLF");
  IElementType KEY = new TacTokenType("KEY");
  IElementType SEPARATOR = new TacTokenType("SEPARATOR");
  IElementType VALUE = new TacTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new TacPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
