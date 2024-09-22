package cn.tao.lang.tac;

import cn.tao.lang.psi.TacFile;
import cn.tao.lang.tac.psi.TacProperty;
import com.google.common.collect.Lists;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * <p>标题： Tac工具类</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/22 20:36</p>
 */
public class TacUtils {

    public static List<TacProperty> findProperties(Project project) {
        List<TacProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFileList = FileTypeIndex.getFiles(TacFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFileList) {
            TacFile file = (TacFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                TacProperty[] properties = PsiTreeUtil.getChildrenOfType(file, TacProperty.class);
                if (properties != null) {
                    Collections.addAll(result, properties);
                }
            }
        }

        return result;
    }

    /**
     * 在整个项目中搜索带有指定键的 Tac属性实例的 Tac语言文件
     * @param project 当前项目
     */
    public static List<TacProperty> findProperties(Project project, String key) {
        List<TacProperty> result = new ArrayList<>();
        Collection<VirtualFile> virtualFileList = FileTypeIndex.getFiles(TacFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFileList) {
            TacFile file = (TacFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                TacProperty[] properties = PsiTreeUtil.getChildrenOfType(file, TacProperty.class);
                if (properties != null) {
                    for (TacProperty property : properties) {
                        if (key.equals(property.getKey())) {
                            result.add(property);
                        }
                    }
                }
            }
        }

        return result;
    }

    /**
     * 收集 Tac键值对上的任何注释
     */
    public static @NotNull String findDocComment(TacProperty property) {
        List<String> result = new LinkedList<>();
        PsiElement element = property.getPrevSibling();
        while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
            if (element instanceof PsiComment) {
                String comment = element.getText().replaceFirst("[!# ]+", "");
                result.add(comment);
            }
            element = element.getPrevSibling();
        }

        return StringUtil.join(Lists.reverse(result), "\n ");
    }
}
