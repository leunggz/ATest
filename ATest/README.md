# ATest（web平台）

## 更新信息：
### v1.0.1（20190901）
**新增内容：**
1. 任务前置：先执行指定前置任务id存在的测试集并把绑定变量赋值给本任务里进行使用（常用使用场景：封装登录步骤）
2. 替换信息：替换对应环境地址或替换对应用例的用例变量值（包括任务前置里面的用例）（常用使用场景：测试环境切换）
3. 产品项目管理：按对应产品项目名管理测试集

**修复优化：**
1. 去掉所有外键，使用程序进行控制
2. 修改任务里测试集管理页面交互
3. 修复已知bug