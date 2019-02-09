package cn.myblogs.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbMoodExample implements Serializable{
	private static final long serialVersionUID=-1l;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMoodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMoIdIsNull() {
            addCriterion("mo_id is null");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNotNull() {
            addCriterion("mo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoIdEqualTo(Integer value) {
            addCriterion("mo_id =", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotEqualTo(Integer value) {
            addCriterion("mo_id <>", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThan(Integer value) {
            addCriterion("mo_id >", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mo_id >=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThan(Integer value) {
            addCriterion("mo_id <", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThanOrEqualTo(Integer value) {
            addCriterion("mo_id <=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdIn(List<Integer> values) {
            addCriterion("mo_id in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotIn(List<Integer> values) {
            addCriterion("mo_id not in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdBetween(Integer value1, Integer value2) {
            addCriterion("mo_id between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mo_id not between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoContentIsNull() {
            addCriterion("mo_content is null");
            return (Criteria) this;
        }

        public Criteria andMoContentIsNotNull() {
            addCriterion("mo_content is not null");
            return (Criteria) this;
        }

        public Criteria andMoContentEqualTo(String value) {
            addCriterion("mo_content =", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentNotEqualTo(String value) {
            addCriterion("mo_content <>", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentGreaterThan(String value) {
            addCriterion("mo_content >", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentGreaterThanOrEqualTo(String value) {
            addCriterion("mo_content >=", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentLessThan(String value) {
            addCriterion("mo_content <", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentLessThanOrEqualTo(String value) {
            addCriterion("mo_content <=", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentLike(String value) {
            addCriterion("mo_content like", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentNotLike(String value) {
            addCriterion("mo_content not like", value, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentIn(List<String> values) {
            addCriterion("mo_content in", values, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentNotIn(List<String> values) {
            addCriterion("mo_content not in", values, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentBetween(String value1, String value2) {
            addCriterion("mo_content between", value1, value2, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoContentNotBetween(String value1, String value2) {
            addCriterion("mo_content not between", value1, value2, "moContent");
            return (Criteria) this;
        }

        public Criteria andMoTimeIsNull() {
            addCriterion("mo_time is null");
            return (Criteria) this;
        }

        public Criteria andMoTimeIsNotNull() {
            addCriterion("mo_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoTimeEqualTo(String value) {
            addCriterion("mo_time =", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeNotEqualTo(String value) {
            addCriterion("mo_time <>", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeGreaterThan(String value) {
            addCriterion("mo_time >", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mo_time >=", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeLessThan(String value) {
            addCriterion("mo_time <", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeLessThanOrEqualTo(String value) {
            addCriterion("mo_time <=", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeLike(String value) {
            addCriterion("mo_time like", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeNotLike(String value) {
            addCriterion("mo_time not like", value, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeIn(List<String> values) {
            addCriterion("mo_time in", values, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeNotIn(List<String> values) {
            addCriterion("mo_time not in", values, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeBetween(String value1, String value2) {
            addCriterion("mo_time between", value1, value2, "moTime");
            return (Criteria) this;
        }

        public Criteria andMoTimeNotBetween(String value1, String value2) {
            addCriterion("mo_time not between", value1, value2, "moTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}