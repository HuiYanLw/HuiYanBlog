package cn.myblogs.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbArticleExample implements Serializable{
	private static final long serialVersionUID=-1l;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbArticleExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andATitleIsNull() {
            addCriterion("a_title is null");
            return (Criteria) this;
        }

        public Criteria andATitleIsNotNull() {
            addCriterion("a_title is not null");
            return (Criteria) this;
        }

        public Criteria andATitleEqualTo(String value) {
            addCriterion("a_title =", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotEqualTo(String value) {
            addCriterion("a_title <>", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThan(String value) {
            addCriterion("a_title >", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleGreaterThanOrEqualTo(String value) {
            addCriterion("a_title >=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThan(String value) {
            addCriterion("a_title <", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLessThanOrEqualTo(String value) {
            addCriterion("a_title <=", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleLike(String value) {
            addCriterion("a_title like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotLike(String value) {
            addCriterion("a_title not like", value, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleIn(List<String> values) {
            addCriterion("a_title in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotIn(List<String> values) {
            addCriterion("a_title not in", values, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleBetween(String value1, String value2) {
            addCriterion("a_title between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andATitleNotBetween(String value1, String value2) {
            addCriterion("a_title not between", value1, value2, "aTitle");
            return (Criteria) this;
        }

        public Criteria andAWriterIsNull() {
            addCriterion("a_writer is null");
            return (Criteria) this;
        }

        public Criteria andAWriterIsNotNull() {
            addCriterion("a_writer is not null");
            return (Criteria) this;
        }

        public Criteria andAWriterEqualTo(String value) {
            addCriterion("a_writer =", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterNotEqualTo(String value) {
            addCriterion("a_writer <>", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterGreaterThan(String value) {
            addCriterion("a_writer >", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterGreaterThanOrEqualTo(String value) {
            addCriterion("a_writer >=", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterLessThan(String value) {
            addCriterion("a_writer <", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterLessThanOrEqualTo(String value) {
            addCriterion("a_writer <=", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterLike(String value) {
            addCriterion("a_writer like", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterNotLike(String value) {
            addCriterion("a_writer not like", value, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterIn(List<String> values) {
            addCriterion("a_writer in", values, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterNotIn(List<String> values) {
            addCriterion("a_writer not in", values, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterBetween(String value1, String value2) {
            addCriterion("a_writer between", value1, value2, "aWriter");
            return (Criteria) this;
        }

        public Criteria andAWriterNotBetween(String value1, String value2) {
            addCriterion("a_writer not between", value1, value2, "aWriter");
            return (Criteria) this;
        }

        public Criteria andASummaryIsNull() {
            addCriterion("a_summary is null");
            return (Criteria) this;
        }

        public Criteria andASummaryIsNotNull() {
            addCriterion("a_summary is not null");
            return (Criteria) this;
        }

        public Criteria andASummaryEqualTo(String value) {
            addCriterion("a_summary =", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryNotEqualTo(String value) {
            addCriterion("a_summary <>", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryGreaterThan(String value) {
            addCriterion("a_summary >", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryGreaterThanOrEqualTo(String value) {
            addCriterion("a_summary >=", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryLessThan(String value) {
            addCriterion("a_summary <", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryLessThanOrEqualTo(String value) {
            addCriterion("a_summary <=", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryLike(String value) {
            addCriterion("a_summary like", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryNotLike(String value) {
            addCriterion("a_summary not like", value, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryIn(List<String> values) {
            addCriterion("a_summary in", values, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryNotIn(List<String> values) {
            addCriterion("a_summary not in", values, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryBetween(String value1, String value2) {
            addCriterion("a_summary between", value1, value2, "aSummary");
            return (Criteria) this;
        }

        public Criteria andASummaryNotBetween(String value1, String value2) {
            addCriterion("a_summary not between", value1, value2, "aSummary");
            return (Criteria) this;
        }

        public Criteria andATimeIsNull() {
            addCriterion("a_time is null");
            return (Criteria) this;
        }

        public Criteria andATimeIsNotNull() {
            addCriterion("a_time is not null");
            return (Criteria) this;
        }

        public Criteria andATimeEqualTo(String value) {
            addCriterion("a_time =", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotEqualTo(String value) {
            addCriterion("a_time <>", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeGreaterThan(String value) {
            addCriterion("a_time >", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeGreaterThanOrEqualTo(String value) {
            addCriterion("a_time >=", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeLessThan(String value) {
            addCriterion("a_time <", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeLessThanOrEqualTo(String value) {
            addCriterion("a_time <=", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeLike(String value) {
            addCriterion("a_time like", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotLike(String value) {
            addCriterion("a_time not like", value, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeIn(List<String> values) {
            addCriterion("a_time in", values, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotIn(List<String> values) {
            addCriterion("a_time not in", values, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeBetween(String value1, String value2) {
            addCriterion("a_time between", value1, value2, "aTime");
            return (Criteria) this;
        }

        public Criteria andATimeNotBetween(String value1, String value2) {
            addCriterion("a_time not between", value1, value2, "aTime");
            return (Criteria) this;
        }

        public Criteria andAReadIsNull() {
            addCriterion("a_read is null");
            return (Criteria) this;
        }

        public Criteria andAReadIsNotNull() {
            addCriterion("a_read is not null");
            return (Criteria) this;
        }

        public Criteria andAReadEqualTo(Integer value) {
            addCriterion("a_read =", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadNotEqualTo(Integer value) {
            addCriterion("a_read <>", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadGreaterThan(Integer value) {
            addCriterion("a_read >", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_read >=", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadLessThan(Integer value) {
            addCriterion("a_read <", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadLessThanOrEqualTo(Integer value) {
            addCriterion("a_read <=", value, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadIn(List<Integer> values) {
            addCriterion("a_read in", values, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadNotIn(List<Integer> values) {
            addCriterion("a_read not in", values, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadBetween(Integer value1, Integer value2) {
            addCriterion("a_read between", value1, value2, "aRead");
            return (Criteria) this;
        }

        public Criteria andAReadNotBetween(Integer value1, Integer value2) {
            addCriterion("a_read not between", value1, value2, "aRead");
            return (Criteria) this;
        }

        public Criteria andClIdIsNull() {
            addCriterion("cl_id is null");
            return (Criteria) this;
        }

        public Criteria andClIdIsNotNull() {
            addCriterion("cl_id is not null");
            return (Criteria) this;
        }

        public Criteria andClIdEqualTo(Integer value) {
            addCriterion("cl_id =", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotEqualTo(Integer value) {
            addCriterion("cl_id <>", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThan(Integer value) {
            addCriterion("cl_id >", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cl_id >=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThan(Integer value) {
            addCriterion("cl_id <", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdLessThanOrEqualTo(Integer value) {
            addCriterion("cl_id <=", value, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdIn(List<Integer> values) {
            addCriterion("cl_id in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotIn(List<Integer> values) {
            addCriterion("cl_id not in", values, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdBetween(Integer value1, Integer value2) {
            addCriterion("cl_id between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andClIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cl_id not between", value1, value2, "clId");
            return (Criteria) this;
        }

        public Criteria andALikeIsNull() {
            addCriterion("a_like is null");
            return (Criteria) this;
        }

        public Criteria andALikeIsNotNull() {
            addCriterion("a_like is not null");
            return (Criteria) this;
        }

        public Criteria andALikeEqualTo(Integer value) {
            addCriterion("a_like =", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeNotEqualTo(Integer value) {
            addCriterion("a_like <>", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeGreaterThan(Integer value) {
            addCriterion("a_like >", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_like >=", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeLessThan(Integer value) {
            addCriterion("a_like <", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeLessThanOrEqualTo(Integer value) {
            addCriterion("a_like <=", value, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeIn(List<Integer> values) {
            addCriterion("a_like in", values, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeNotIn(List<Integer> values) {
            addCriterion("a_like not in", values, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeBetween(Integer value1, Integer value2) {
            addCriterion("a_like between", value1, value2, "aLike");
            return (Criteria) this;
        }

        public Criteria andALikeNotBetween(Integer value1, Integer value2) {
            addCriterion("a_like not between", value1, value2, "aLike");
            return (Criteria) this;
        }

        public Criteria andAGroomIsNull() {
            addCriterion("a_groom is null");
            return (Criteria) this;
        }

        public Criteria andAGroomIsNotNull() {
            addCriterion("a_groom is not null");
            return (Criteria) this;
        }

        public Criteria andAGroomEqualTo(Integer value) {
            addCriterion("a_groom =", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomNotEqualTo(Integer value) {
            addCriterion("a_groom <>", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomGreaterThan(Integer value) {
            addCriterion("a_groom >", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_groom >=", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomLessThan(Integer value) {
            addCriterion("a_groom <", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomLessThanOrEqualTo(Integer value) {
            addCriterion("a_groom <=", value, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomIn(List<Integer> values) {
            addCriterion("a_groom in", values, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomNotIn(List<Integer> values) {
            addCriterion("a_groom not in", values, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomBetween(Integer value1, Integer value2) {
            addCriterion("a_groom between", value1, value2, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAGroomNotBetween(Integer value1, Integer value2) {
            addCriterion("a_groom not between", value1, value2, "aGroom");
            return (Criteria) this;
        }

        public Criteria andAImgIsNull() {
            addCriterion("a_img is null");
            return (Criteria) this;
        }

        public Criteria andAImgIsNotNull() {
            addCriterion("a_img is not null");
            return (Criteria) this;
        }

        public Criteria andAImgEqualTo(String value) {
            addCriterion("a_img =", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotEqualTo(String value) {
            addCriterion("a_img <>", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgGreaterThan(String value) {
            addCriterion("a_img >", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgGreaterThanOrEqualTo(String value) {
            addCriterion("a_img >=", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLessThan(String value) {
            addCriterion("a_img <", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLessThanOrEqualTo(String value) {
            addCriterion("a_img <=", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgLike(String value) {
            addCriterion("a_img like", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotLike(String value) {
            addCriterion("a_img not like", value, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgIn(List<String> values) {
            addCriterion("a_img in", values, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotIn(List<String> values) {
            addCriterion("a_img not in", values, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgBetween(String value1, String value2) {
            addCriterion("a_img between", value1, value2, "aImg");
            return (Criteria) this;
        }

        public Criteria andAImgNotBetween(String value1, String value2) {
            addCriterion("a_img not between", value1, value2, "aImg");
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