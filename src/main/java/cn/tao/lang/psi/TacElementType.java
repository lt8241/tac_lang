package cn.tao.lang.psi;

import cn.tao.lang.tac.TacLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

/**
 * <p>标题： Tac元素类型</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/21 14:03</p>
 */
public class TacElementType extends IElementType {

    public TacElementType(@NonNls @NotNull String debugName) {
        super(debugName, TacLanguage.INSTANCE);
    }
}
