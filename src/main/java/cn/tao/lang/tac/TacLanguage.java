package cn.tao.lang.tac;

import cn.tao.lang.constants.CfgContants;
import com.intellij.lang.Language;
import java.io.Serial;


/**
 * <p>标题： Tac语言</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/21 11:32</p>
 */
public class TacLanguage extends Language {
    @Serial
    private static final long serialVersionUID = -615470014681799989L;

    public static final TacLanguage INSTANCE = new TacLanguage();

    private TacLanguage()
    {
        super(CfgContants.LangID);
    }

}
