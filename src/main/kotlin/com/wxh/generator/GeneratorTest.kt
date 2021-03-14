import com.baomidou.mybatisplus.annotation.DbType
import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.core.toolkit.StringPool
import com.baomidou.mybatisplus.generator.AutoGenerator
import com.baomidou.mybatisplus.generator.InjectionConfig
import com.baomidou.mybatisplus.generator.config.*
import com.baomidou.mybatisplus.generator.config.po.TableInfo
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine
import org.junit.Ignore
import org.junit.Test
import java.util.ArrayList

/**
 * @program: xxx-yyyyyy
 *
 * @description: GeneratorTest
 *
 * @author: loulvlin
 *
 * @create: 2020-05-26 17:26
 **/
class GeneratorTest {

    @Ignore
    @Test
    fun userdir(){
        val projectPath = System.getProperty("user.dir")
        println(projectPath)
    }

    /**
     * @Description: 只有需要生成代码时才放开此单元测试方法
     * @Param:
     * @return:
     * @Author: loulvlin
     * @Date: 2020/5/27 上午8:57
     */
//    @Ignore
    @Test
    fun generator(){
        val projectPath = System.getProperty("user.dir")

        var mpg = AutoGenerator()

        var globalConfig = GlobalConfig();
        globalConfig.isKotlin = true
        globalConfig.author = "wxh"
        globalConfig.isOpen = false
        globalConfig.outputDir = System.getProperty("user.dir") + "/src/main/kotlin"
        globalConfig.isFileOverride = true
        globalConfig.idType = IdType.AUTO
        globalConfig.xmlName = "%sMapper"
        globalConfig.mapperName = "%sMapper"
        globalConfig.serviceImplName = "%sServiceImpl"
        globalConfig.controllerName = "%sController"
        globalConfig.isBaseColumnList = true
        globalConfig.isBaseResultMap = true

        mpg.globalConfig = globalConfig

        var dsc = com.baomidou.mybatisplus.generator.config.DataSourceConfig()
        dsc.dbType = DbType.MYSQL
        dsc.driverName = "com.mysql.cj.jdbc.Driver"
        dsc.url = "jdbc:mysql://localhost:3306/whl?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true"
        dsc.username = "root"
        dsc.password = "admin"

        mpg.dataSource = dsc


        // 自定义配置
        val cfg: InjectionConfig = object : InjectionConfig() {
            override fun initMap() {
                // to do nothing
            }
        }
        val focList: MutableList<FileOutConfig> = ArrayList()
        focList.add(object : FileOutConfig("/templates/mapper.xml.ftl") {
            override fun outputFile(tableInfo: TableInfo): String? {
                // 自定义输入文件名称
                return (projectPath.toString() + "/src/main/resources/mapper/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML)
            }
        })

        //　config xml　template and outpath
        cfg.fileOutConfigList = focList
        mpg.cfg = cfg

        mpg.template = TemplateConfig().setXml(null)
                .setController(null)
                .setService(null)
                .setServiceImpl(null)
//                .setMapper(null)
//                .setEntity(null)
//                .setEntityKt(null)


        var sc = StrategyConfig()
        sc.columnNaming = NamingStrategy.underline_to_camel
        sc.setTablePrefix("sys")
        sc.setInclude("sys_xxx_yyyy")
        sc.naming = NamingStrategy.underline_to_camel
        sc.isEntityLombokModel = true
        sc.isRestControllerStyle = true
        mpg.strategy = sc

        var pkConfig = PackageConfig()
        pkConfig.parent = "com.wxh"
        pkConfig.controller = "controller"
        pkConfig.entity = "entity"
        pkConfig.service = "service"
        pkConfig.mapper = "dao"
        mpg.packageInfo = pkConfig

        mpg.templateEngine = FreemarkerTemplateEngine()
        mpg.execute();
    }
}