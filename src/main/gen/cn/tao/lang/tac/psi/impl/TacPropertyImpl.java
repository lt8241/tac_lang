// This is a generated file. Not intended for manual editing.
package cn.tao.lang.tac.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cn.tao.lang.tac.psi.TacTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cn.tao.lang.tac.psi.*;
import cn.tao.lang.psi.impl.TacPsiImplUtils;

public class TacPropertyImpl extends ASTWrapperPsiElement implements TacProperty {

  public TacPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TacVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TacVisitor) accept((TacVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public String getKey() {
    return TacPsiImplUtils.getKey(this);
  }

  @Override
  public String getValue() {
    return TacPsiImplUtils.getValue(this);
  }

}
