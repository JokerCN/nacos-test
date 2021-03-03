# nacos-test

## 需求
### 1. 测试分布式一致性（AP）
前置条件：注册中心Nacos3个节点的部署与正常运行
##### nacos-test-client 
能够独立请求nacos的三个不同的节点，分别进行服务注册与获取服务列表
其中：
- client不停的获取注册中心的服务列表，并将查询的时延，获取到的服务的记录发送到一个中间结果服务中
- client能够注册服务，并将注册服务的结果发送到中间结果服务中
##### nacos-test-server 
能够查询测试的结果，能够支持存储client的结果
- 接受client推送测试的结果，并存储到数据库中
- 提供测试数据结果的查询和展示功能

## 设计
### 1. nacos-test-server的数据库访问
数据库访问使用mybatis-plus
