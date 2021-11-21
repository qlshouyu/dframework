package com.shouyu.dframework.dframework.demo.infrastructure.repository.account;

import com.shouyu.dframework.respository.criteria.AbstractCriteria;
import com.shouyu.dframework.respository.criteria.PageExample;

import java.util.List;

public class AccountExample extends PageExample<AccountExample.UcAccountCriteria> {


    public static class UcAccountCriteria extends AbstractCriteria {

        public AbstractCriteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public AbstractCriteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public AbstractCriteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public AbstractCriteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public AbstractCriteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public AbstractCriteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public AbstractCriteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public AbstractCriteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public AbstractCriteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return this;
        }

        public AbstractCriteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return this;
        }

        public AbstractCriteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public AbstractCriteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public AbstractCriteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public AbstractCriteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public AbstractCriteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return this;
        }

        public AbstractCriteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return this;
        }

        public AbstractCriteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return this;
        }

        public AbstractCriteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return this;
        }

        public AbstractCriteria andPwdIsNull() {
            addCriterion("pwd is null");
            return this;
        }

        public AbstractCriteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return this;
        }

        public AbstractCriteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return this;
        }

        public AbstractCriteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return this;
        }

        public AbstractCriteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return this;
        }

        public AbstractCriteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return this;
        }

        public AbstractCriteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return this;
        }

        public AbstractCriteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return this;
        }

        public AbstractCriteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return this;
        }

        public AbstractCriteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return this;
        }

        public AbstractCriteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public AbstractCriteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public AbstractCriteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public AbstractCriteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public AbstractCriteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return this;
        }

        public AbstractCriteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return this;
        }

        public AbstractCriteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return this;
        }

        public AbstractCriteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return this;
        }

        public AbstractCriteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return this;
        }

        public AbstractCriteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return this;
        }

        public AbstractCriteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return this;
        }

        public AbstractCriteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return this;
        }

        public AbstractCriteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return this;
        }

        public AbstractCriteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return this;
        }

        public AbstractCriteria andIsDeleteEqualTo(Short value) {
            addCriterion("is_delete =", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteNotEqualTo(Short value) {
            addCriterion("is_delete <>", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteGreaterThan(Short value) {
            addCriterion("is_delete >", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("is_delete >=", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteLessThan(Short value) {
            addCriterion("is_delete <", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteLessThanOrEqualTo(Short value) {
            addCriterion("is_delete <=", value, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteIn(List<Short> values) {
            addCriterion("is_delete in", values, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteNotIn(List<Short> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteBetween(Short value1, Short value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return this;
        }

        public AbstractCriteria andIsDeleteNotBetween(Short value1, Short value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return this;
        }
    }
}
