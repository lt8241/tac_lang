package cn.tao.lang.tac;

import cn.tao.lang.constants.CfgContants;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * <p>标题： Tac文件类型</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/21 11:31</p>
 */
public class TacFileType extends LanguageFileType {

    public static final TacFileType INSTANCE = new TacFileType();

    private TacFileType() {
        super(TacLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return CfgContants.FileType_Name;
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return CfgContants.FileType_Desc;
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return CfgContants.FileType_DftExtension;
    }

    @Override
    public Icon getIcon() {
        return TacIcons.FILE;
    }
}
