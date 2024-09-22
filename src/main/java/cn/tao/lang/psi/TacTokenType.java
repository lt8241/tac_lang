package cn.tao.lang.psi;

import cn.tao.lang.constants.CfgContants;
import cn.tao.lang.tac.TacLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

/**
 * <p>标题： Tac令牌类型</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/21 13:57</p>
 */
public class TacTokenType extends IElementType {

    public TacTokenType(@NonNls @NotNull String debugName) {
        super(debugName, TacLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return CfgContants.TokenType_Str + super.toString();
    }
}
