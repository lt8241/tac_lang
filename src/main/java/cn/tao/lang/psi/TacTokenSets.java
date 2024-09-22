package cn.tao.lang.psi;

import cn.tao.lang.tac.psi.TacTypes;
import com.intellij.psi.tree.TokenSet;

/**
 * <p>标题： Tac令牌集</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/22 13:26</p>
 */
public interface TacTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(TacTypes.KEY);

    TokenSet COMMENTS = TokenSet.create(TacTypes.COMMENT);
}
