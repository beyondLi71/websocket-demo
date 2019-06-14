### 使用说明
#### 1.拷贝pom.xml中的websocket依赖
#### 2.复制 src -> main -> java -> com -> beyondli 下的common和controller文件下所有内容
#### 3.启动项目
#### 4.将resources -> templates 中的 websocket-demo.html直接拿出来使用浏览器访问(因为是前后端分离,虽然放在templates中但是和jsp什么的完全没关系,就是单纯的放一下)
#### 5.访问html,弹窗连接成功
#### 6.换个窗口访问url http://localhost:8080/checkcenter/socket/push/20?message=测试推送内容
#### 7.回到刚才html窗口,内容已被推送过来并以弹窗形式展示