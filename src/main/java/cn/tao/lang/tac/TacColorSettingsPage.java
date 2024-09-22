package cn.tao.lang.tac;

import cn.tao.lang.constants.CfgContants;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

/**
 * <p>标题： Tac颜色设置页面</p>
 * <p>功能： 支持用户自定义语法高亮颜色</p>
 * <p>创建日期：2024/9/22 19:49</p>
 */
final class TacColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", TacSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", TacSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", TacSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", TacSyntaxHighlighter.BAD_CHARACTER)
    };

    @Override
    public @NotNull Icon getIcon() {
        return TacIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new TacSyntaxHighlighter();
    }

    @Override
    public @NonNls @NotNull String getDemoText() {
        return """
        # You are reading the ".properties" entry.
        ! The exclamation mark can also mark text as comments.
        website = https://en.wikipedia.org/
        language = English
        # The backslash below tells the application to continue reading
        # the value onto the next line.
        message = Welcome to \\
                  Wikipedia!
        # Add spaces to the key
        key\\ with\\ spaces = This is the value that could be looked up with the key "key with spaces".
        # Unicode
        tab : \\u0009""";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return CfgContants.LangID;
    }
}
