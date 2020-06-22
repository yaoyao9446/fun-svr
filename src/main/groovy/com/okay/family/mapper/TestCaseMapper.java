package com.okay.family.mapper;

import com.okay.family.common.bean.common.DelBean;
import com.okay.family.common.bean.common.ProjectBean;
import com.okay.family.common.bean.testcase.request.*;
import com.okay.family.common.bean.testcase.response.CaseDetailBean;
import com.okay.family.common.bean.testcase.response.CaseEditRetrunRecord;
import com.okay.family.common.bean.testcase.response.TestCaseAttributeBean;
import com.okay.family.common.bean.testcase.response.TestCaseListBean;

import java.util.List;

public interface TestCaseMapper {

    int addCase(EditCaseAttributeBean bean);

    int copyCase(EditCaseAttributeBean bean);

    int updateCase(EditCaseAttributeBean bean);

    int delCase(DelBean bean);

    void addCaseProjectRelation(EditCaseAttributeBean bean);

    void copyCaseProjectRelation(int source, int target);

    void delCaseProjectRelation(DelBean bean);

    void addEditRecord(CaseEditRecord record);

    int updateCaseData(CaseDataBean bean);

    List<TestCaseListBean> searchCases(CaseSearchBean bean);

    TestCaseAttributeBean getAttributeById(int id);

    List<ProjectBean> getCaseProjectRelation(int id);

    List<CaseEditRetrunRecord> getCaseEditRecords(CaseEditRecordQueryBean bean);

    CaseDetailBean getCaseDetail(int id);
    //todo:增加SQL语句
    void addRunRecord(CaseRunRecord record);
}
