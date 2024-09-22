package cn.tao.lang.psi;

import cn.tao.lang.constants.CfgContants;
import cn.tao.lang.tac.TacFileType;
import cn.tao.lang.tac.TacLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import java.io.Serial;

/**
 * <p>标题： Tac文件</p>
 * <p>功能： 用于Tac文件的 PsiElements树的顶级节点</p>
 * <p>创建日期：2024/9/22 13:21</p>
 */
public class TacFile extends PsiFileBase {

    @Serial
    private static final long serialVersionUID = 4901911015177815137L;

    public TacFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TacLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public  FileType getFileType() {
        return TacFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return CfgContants.FileType_Name;
    }
}
