# 企业活跃度月份处理算法
# Dependence
:eyes::eyes::eyes:
# Quick Start
## Environment configuration (adding environment variables)
* JAVA 1.8 runtime environment (JAVA_HOME)
* Hadoop __offline__ environment (HADOOP_HOME)
## Dependency Building
* Add `.jar` file under `/lib` to the project dependencies
* Run the 'pom.xml' file
## Data Preparation
> ../月底统计/变更情况表
> 
> ../月底统计/分支机构表
> 
> ../月底统计/企业关系人表
> 
> ../月底统计/迁移信息表
> 
> ../月底统计/异常名录
> 
> ../月底统计/主体登记
> 
<u>The folder name needs to be consistent</u>

## Add parameters
Make modifications in `/src/test1/test2.java`：

Input：The path of the input file `../月底统计xxxx`

Output: The path of the output file

stdate：Starting date of data

endate：Ending date of data

## Start Running
Estimating 10-20 minutes before finishing :sweat_smile:

# Results

After the program is completed, you can see the results in the path: `Output/res`
