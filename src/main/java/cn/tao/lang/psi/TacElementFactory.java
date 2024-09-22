package cn.tao.lang.psi;

import cn.tao.lang.tac.TacFileType;
import cn.tao.lang.tac.psi.TacProperty;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;

/**
 * <p>标题： </p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/22 20:20</p>
 */
public class TacElementFactory {

    public static TacFile createFile(Project project, String text) {
        String name = "dummy.tac";
        return (TacFile) PsiFileFactory.getInstance(project).createFileFromText(name, TacFileType.INSTANCE, text);
    }

    public static TacProperty createProperty(Project project, String name) {
        final TacFile file = createFile(project, name);
        return (TacProperty) file.getFirstChild();
    }

    public static TacProperty createProperty(Project project, String name, String value) {
        final TacFile file = createFile(project, name + " = " + value);
        return (TacProperty) file.getFirstChild();
    }

    /**
     * 创建换行符
     */
    public static PsiElement createCRLF(Project project) {
        final TacFile file = createFile(project, "\n");
        return file.getFirstChild();
    }
}
