package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {

    public static void main(String[] args) throws TemplateException, IOException {
        // 1.静态文件生成
        // 项目根目录
        String projectPath = System.getProperty("user.dir");
        // System.out.println(projectPath);
        // 输入路径    File.separator:文件分割符，不同的操作系统不一样
        String inputPath = projectPath + File.separator + "shousi-generator-demo-projects" + File.separator + "acm-template";
        // 输出路径
        String outputPath = projectPath;

        StaticGenerator.copyFileByRecursive(inputPath, outputPath);

        // 2.动态文件生成
        String dynamicInputPath = projectPath + File.separator + "shousi-generator-basic" +  File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/shousi/acm/MainTemplate.java";

        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("shousi");
        mainTemplateConfig.setOutputText("输出结果");
        mainTemplateConfig.setLoop(false);

        DynamicGenerator.doGenerate(dynamicInputPath, dynamicOutputPath, mainTemplateConfig);
    }

}
