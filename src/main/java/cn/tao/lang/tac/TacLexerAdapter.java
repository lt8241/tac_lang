package cn.tao.lang.tac;

import com.intellij.lexer.FlexAdapter;

/**
 * <p>标题： 词法分析器适配器</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/22 13:15</p>
 */
public class TacLexerAdapter extends FlexAdapter {
    public TacLexerAdapter() {
        super(new TacLexer(null));
    }
}
