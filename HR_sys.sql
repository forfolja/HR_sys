CREATE TABLE employee(
                         `id` INT(11) NOT NULL AUTO_INCREMENT,
                         `employee_id` VARCHAR(20) NOT NULL COMMENT '员工工号',
                         `employee_name` VARCHAR(30) NOT NULL COMMENT '员工姓名',
                         `gender` INT(1) NOT NULL COMMENT '性别：0->未选择；1->男；2->女' ,
                         `birthday` DATE NOT NULL COMMENT '员工生日',
                         `active_status` INT(2) NOT NULL COMMENT '员工状态：0->初始化；1->正常；2->停用;3->离职'  DEFAULT '0',
                         `tel_number` INT(11) NOT NULL COMMENT '手机号码',
                         `contract_starting_time` DATE NOT NULL COMMENT '入职时间',
                         `organization_id` INT(11) NOT NULL COMMENT '员工属于部门',
                         `total_salary` DECIMAL(10,2) COMMENT '员工工资',
                         `job_title_id` INT(2) NOT NULL COMMENT '员工职位',
                         `create_time` DATETIME NOT NULL COMMENT '创建时间',
                         `update_time` DATETIME COMMENT '更新时间',
                         PRIMARY KEY(`id`),
                         UNIQUE KEY `employeeID` (`employee_id`),
                         KEY `employeeName` (`employee_name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE organization(
                             `id` INT(11) NOT NULL AUTO_INCREMENT,
                             `organization_id` INT(11) NOT NULL COMMENT '组织编号',
                             `organization_name` VARCHAR(50) NOT NULL COMMENT '组织名称',
                             `parent_organization_id` INT(11) COMMENT '上级组织编号',
                             `organization_status` INT(2) NOT NULL COMMENT '组织状态：0->初始化；1->正常；2->停用;3->归档',
                             `create_time` DATETIME NOT NULL COMMENT '创建时间',
                             `update_time` DATETIME COMMENT '更新时间',
                             PRIMARY KEY(`id`),
                             UNIQUE KEY `organizationID` (`organization_id`),
                             KEY `organizationName` (`organization_name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE jobtitle(
                         `id` INT(11) NOT NULL AUTO_INCREMENT,
                         `jobtitle_id` VARCHAR(10)  NOT NULL COMMENT '职位编号',
                         `jobtitle_type` VARCHAR(6) NOT NULL COMMENT '职位类型：T->技术序列；S->营销序列；F->财务序列；M->管理序列',
                         `jobtitle_name` VARCHAR(50) NOT NULL COMMENT '职位名称',
                         `jobtitle_status` INT(2) NOT NULL COMMENT '职位状态：0->初始化；1->正常；2->停用；3->归档' DEFAULT '0',
                         `jobtitle_level` INT(2) NOT NULL COMMENT '职级',
                         `create_time` DATETIME NOT NULL COMMENT '创建时间',
                         `update_time` DATETIME COMMENT '更新时间',
                         PRIMARY KEY(`id`),
                         UNIQUE KEY `jobtitleID` (`jobtitle_id`),
                         KEY `jobtitleName` (`jobtitle_name`),
                         KEY `jobtitleLevel` (`jobtitle_level`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE salary_jobtitle (
                                 `id` INT(11) NOT NULL AUTO_INCREMENT,
                                 `salary_id` INT(10) NOT NULL COMMENT '工资模板编号',
                                 `salary_base` DECIMAL(10,2) NOT NULL COMMENT '基本工资',
                                 `salary_bonus` DECIMAL(10,2) NOT NULL COMMENT '绩效工资',
                                 `jobtitle_id` INT(2) NOT NULL COMMENT '职位编号',
                                 `create_time` DATETIME NOT NULL COMMENT '创建时间',
                                 `update_time` DATETIME COMMENT '更新时间',
                                 PRIMARY KEY(`id`),
                                 KEY `jobtitleID` (`jobtitle_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;