package cn.tao.lang.tac;

import cn.tao.lang.psi.TacFile;
import cn.tao.lang.psi.TacTokenSets;
import cn.tao.lang.tac.parser.TacParser;
import cn.tao.lang.tac.psi.TacTypes;
import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

/**
 * <p>标题： Tac解析器定义</p>
 * <p>功能： </p>
 * <p>创建日期：2024/9/22 13:31</p>
 */
final class TacParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(TacLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new TacLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new TacParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return TacTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return TacTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new TacFile(viewProvider);
    }
}
