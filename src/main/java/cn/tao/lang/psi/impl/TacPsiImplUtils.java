package cn.tao.lang.psi.impl;

import cn.tao.lang.tac.psi.TacProperty;
import cn.tao.lang.tac.psi.TacTypes;
import com.intellij.lang.ASTNode;

/**
 * <p>标题： PSI(Program Structure Interface：程序结构接口)工具类</p>
 * <p>功能： 用于生成 PSI元素</p>
 * <p>创建日期：2024/9/22 20:05</p>
 */
public class TacPsiImplUtils {

    public static String getKey(TacProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(TacTypes.KEY);
        if (keyNode != null) {
            // 将嵌入的转义符替换为简单空格
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(TacProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(TacTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

}
