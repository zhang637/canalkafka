package com.gbicc.canal;

import com.gbicc.util.DateUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by root on 2017/4/19.
 */
public class Test5 {
    @Test
    public void b7(){
        String a="10:30:06.154 [Thread-2] INFO  com.gbicc.canal.Canal2Local - 将rms_interface_deal_log数据文件写入到/interactive/source_add/FK_files/e040_rms_interface_deal_log_20170425102940.tmp路径下";
        System.out.println(a.split("/").length);
        for (String s : a.split("/")) {
            System.out.println(s);
        }
    }

    @Test
    public void b3(){
        String s="als.user_info,als.impower_to_user,als.customer_belong,als.customer_contacts,als.customer_special,als.customer_info,als.customer_relative,als.customer_partner,als.ent_info,als.ind_info,als.insure_loan_paymen_plan,als.insured_list,als.insure_special_agreement,als.insure_payment_plan,als.flow_record,als.insuretype,als.insure_message,als.business_type,als.business_typeset,als.policy_request,als.assetlist,als.guaranty_info,als.business_apply,als.business_contract,als.org_info,als.acct_payment_log,als.guaranty_contract,als.acct_trans_payment,als.loan_info,als.insuranceman_info,als.insured_info,als.project_info,als.cms_collateraltype_info,als.insure_info,als.acct_payment_schedule,als.acct_loan,als.acct_loan_change,als.acct_ahead,als.user_list,als.business_return,als.fund_strench_people,als.fee_infomation,als.customer_creditmmm,suncs.code_catalog,suncs.code_library,suncs.cs_call_record,suncs.cs_call_work,suncs.cs_callon_apply,suncs.cs_callon_work,suncs.cs_case_assign,suncs.cs_case_info,suncs.cs_coll_promise,suncs.cs_coll_record,suncs.cs_customer_info,suncs.cs_email_work,suncs.cs_justice_apply,suncs.cs_justice_work,suncs.cs_letters_work,suncs.cs_message_work,suncs.cs_outsourcing_apply,suncs.cs_outsourcing_work,suncs.cs_relationinfo,suncs.cs_repay_schedule,suncs.cs_waterbook,suncs.customer_contacts,suncs.customer_info,suncs.work_record,rms.edt_ar_cheat_cuikuan,rms.edt_ar_cheat_info,rms.edt_ar_cheat_shixin,rms.edt_ar_cheat_zhixing,rms.edt_ar_person_anliinfo,rms.edt_ar_person_cuikuan,rms.edt_ar_person_shixininfo,rms.edt_ar_person_zhixing,rms.edt_br_special_cell_list,rms.edt_br_special_list,rms.edt_dsinterface_config,rms.edt_dstrace_detail,rms.edt_gzt_education_audit,rms.edt_gzt_indentity_info,rms.edt_ja_check_info,rms.edt_lhp_alipay_info,rms.edt_lhp_alipaytypemap_list,rms.edt_lhp_delivery_list,rms.edt_lhp_message_list,rms.edt_lhp_orderdetail_list,rms.edt_lhp_ordermap_list,rms.edt_lhp_payinfo_list,rms.edt_lhp_paymap_list,rms.edt_lhp_phoneall_list,rms.edt_lhp_phonebill_list,rms.edt_lhp_phoneinfo_list,rms.edt_lhp_policy_list,rms.edt_lhp_rule_info,rms.edt_lhp_tradeanalyze_info,rms.edt_parameter_rule,rms.edt_py_account_info,rms.edt_py_person_card_importantinfo,rms.edt_py_person_cardinfos,rms.edt_py_person_expense_analysis,rms.edt_py_person_expense_area,rms.edt_py_person_expense_rank,rms.edt_py_person_expense_time,rms.edt_py_person_info,rms.edt_py_person_month,rms.edt_py_person_month_expense,rms.edt_py_person_overview,rms.edt_rrx_person_riskinfo,rms.edt_yx_risk_bond_info,rms.edt_yx_risk_borrow_info,rms.edt_yx_risk_borrow_query,rms.edt_yx_risk_borrow_record,rms.edt_yx_risk_borrow_times,rms.edt_yx_risk_link_info,rms.rms_busi_account,rms.rms_busi_apply,rms.rms_busi_flow,rms.rms_busi_flow_sts,rms.rms_busi_flow_sts_log,rms.rms_busi_type,rms.rms_cgrant_apply,rms.rms_cgrant_eb_main,rms.rms_cgrant_eb_receiver,rms.rms_cgrant_upload,rms.rms_interface_deal_log,rms.rms_interface_trade_log,rms.rms_order,rms.rms_order_change,rms.rms_order_repayment,rms.rms_order_repayment_plan,rms.rms_order_repayment_plan_log,rms.rms_order_status,rms.rms_order_trans_rule_desc,rms.rms_order_trigger_rule,rms.rms_org_role,rms.rms_organ,rms.rms_person,rms.rms_product,rms.rms_product_plan,rms.rms_risk_desc,rms.rms_trans_credit_apply_req,rms.rms_trans_credit_apply_res,rms.rms_trans_credit_query_req,rms.rms_trans_credit_query_res,rms.rms_trans_order_change_plan_req,rms.rms_trans_order_change_req,rms.rms_trans_order_change_res,rms.rms_trans_order_confirm_res,rms.rms_trans_order_confirm_rule_req,rms.rms_trans_order_confirme_req,rms.rms_trans_order_notice_plan_req,rms.rms_trans_order_notice_req,rms.rms_trans_order_notice_res,rms.rms_trans_repayment_notice_req,rms.rms_trans_repayment_notice_res,rms.rule_parameter,rms.rule_process,rms.rms_cgrant_high_quality,rms.rms_busi_account_cgrant,rms.rms_busi_account_change_reason,rms.rms_busi_account_month,rms.rms_busi_account_status,rms.rms_call_claim_req,rms.rms_call_claim_res,rms.rms_quant_loan_apply,rms.rms_quant_repayment,rms.rms_quant_repayment_plan,rms.rms_task_call_claim,rms.rms_busi_account,rms.rms_busi_type,rms.rms_cgrant_apply,rms.rms_order,rms.rms_order_repayment,rms.rms_order_repayment_plan,rms.rms_order_status,rms.rule_parameter,rccp.rc_atifraud_queue,rccp.rc_busi_applicant,rccp.rc_busi_application,rccp.rc_busi_apply,rccp.rc_busi_cba,rccp.rc_busi_channel,rccp.rc_busi_creditbureau,rccp.rc_busi_flow,rccp.rc_busi_flow_rule,gw2.t_yurong_basecode_prpdbusilevel,gw2.t_yurong_basecode_prpdcode,gw2.t_yurong_basecode_prpdcompany,gw2.t_yurong_basecode_prpduser,gw2.t_yurong_complaints_message,gw2.t_yurong_dept,gw2.t_yurong_employee,gw2.t_yurong_eportal_account,gw2.t_yurong_eportal_auth,gw2.t_yurong_eportal_message,gw2.t_yurong_eportal_order,gw2.t_yurong_eportal_orderinfo,gw2.t_yurong_kindinfo,gw2.t_yurong_mailinfo,gw2.t_yurong_person_account,gw2.t_yurong_programme_order,cgidb.PrpLrelatePerson,cgidb.PrpLscheduleNew,cgidb.PrpLscheduleMain,cgidb.PrpLscheduleItem,cgidb.PrpLscheduleObject,cgidb.PrpLcheckItem,cgidb.PrpLcheck,cgidb.PrpLcheckExt,cgidb.PrpLcheckLoss,cgidb.PrpLclaimfee,cgidb.PrpLthirdparty,cgidb.PrpLthirdCarLoss,cgidb.PrpLthirdProp,cgidb.PrpLdoc,cgidb.PrpLcertifyCollect,cgidb.PrpLcertifyImg,cgidb.PrpLassure,cgidb.PrpLassureDetail,cgidb.PrpLverifyLoss,cgidb.PrpLprop,cgidb.PrpLarrearage,cgidb.PrpLclaimagent,cgidb.PrpLcaseno,cgidb.PrpLendor,cgidb.PrpLpersonloss,cgidb.PrpLmedicine,cgidb.PrpLafterward,cgidb.PrpLreclaim,cgidb.PrpLreplevy,cgidb.PrpLreplevyDetail,cgidb.PrpLCMain,cgidb.PrpLCItemCar,cgidb.PrpLCitemKind,cgidb.PrpLclaimApprov,cgidb.PrpLinvestigate,cgidb.PrpLbackVisit,cgidb.PrpLbackVisitQue,cgidb.PrpLbackVisitText,cgidb.prplrecoverymain,cgidb.prplrecprojectdetail,cgidb.prplregisttext,cgidb.prplreport,policy.conf_base_info,policy.conf_organization,policy.conf_premium,policy.conf_product,policy.apply_applicant,policy.apply_baseinfo,policy.apply_expense,policy.apply_goods,policy.apply_insured,policy.apply_loan,policy.apply_loan_plan,policy.apply_order,policy.apply_plan,policy.apply_sales,policy.apply_subrisk,policy.endo_applicant,policy.endo_baseinfo,policy.endo_expense,policy.endo_head,policy.endo_insured,policy.endo_loan,policy.endo_loan_plan,policy.endo_order,policy.endo_plan,policy.endo_sales,policy.endo_subrisk,policy.endo_textinfo,policy.state,policy.state_path,policy.uw_applicant,policy.uw_baseinfo,policy.uw_baseinfo_origin,policy.uw_expense,policy.uw_expense_origin,policy.uw_insured,policy.uw_loan,policy.uw_loan_plan,policy.uw_order,policy.uw_plan,policy.uw_sales,policy.uw_subrisk,policy.uw_subrisk_origin,policy.trans_log,policy.tb_sequence,policy.finance_detail ,policy.finance_plan,policy.finance_repayment,policy.finance_repayment_plan,policy.mobp2p_br_report,policy.rr_rent_pledge,cgidb.PRPCADDRESS,cgidb.PRPCCOINS,cgidb.PRPCCOINSDETAIL,cgidb.PRPCCOINSORIGIN,cgidb.PRPCDANGERUNIT,cgidb.PRPCENGAGE,cgidb.PRPCEXPENSE,cgidb.PRPCFEE,cgidb.PRPCFEEORIGIN,cgidb.PRPCINSURED,cgidb.PRPCITEMHOUSE,cgidb.PRPCITEMKIND,cgidb.PRPCMAINAGRI,cgidb.PRPCMAINCONSTRUCT,cgidb.PRPCMAINORIGIN,cgidb.PRPCMAINPROP,cgidb.PRPCPADDRESS,cgidb.PRPCPCOINS,cgidb.PRPCPCOINSDETAIL,cgidb.PRPCPENGAGE,cgidb.PRPCPFEE,cgidb.PRPCPINSURED,cgidb.PRPCPITEMHOUSE,cgidb.PRPCPITEMKIND,cgidb.PRPCPLAN,cgidb.PRPCPLIMIT,cgidb.PRPCPMAIN,cgidb.PRPCPMAINAGRI,cgidb.PRPCPMAINLOAN,cgidb.PRPCPMAINPROP,cgidb.PRPCPPLAN,cgidb.PRPDAGENT,cgidb.PRPDCLASS,cgidb.PRPDCODE,cgidb.PRPDCODERISK,cgidb.PRPDCOMPANY,cgidb.PRPDEXCH,cgidb.PRPDRISK,cgidb.PRPJPAYREFREC,cgidb.PRPJPLANFEE,cgidb.PRPLCFEE,cgidb.PRPLCHARGE,cgidb.PRPLCLAIM,cgidb.PRPLCLAIMLOSS,cgidb.PRPLPAY,cgidb.PRPLPREPAY,cgidb.PRPLRECASE,cgidb.PRPLREGIST,cgidb.PRPPDANGERUNIT,cgidb.PRPPENGAGE,cgidb.PRPPFEE,cgidb.PRPPHEAD,cgidb.PRPPINSURED,cgidb.PRPPITEMKIND,cgidb.PRPPLIMIT,cgidb.PRPPMAIN,cgidb.PRPPMAINLOAN,cgidb.PRPPPLAN,cgidb.PRPPTEXT,cgidb.PRPTADDRESS,cgidb.PRPTCOINS,cgidb.PRPTCOINSDETAIL,cgidb.PRPTDANGERUNIT,cgidb.PRPTENGAGE,cgidb.PRPTFEE,cgidb.PRPTINSURED,cgidb.PRPTITEMHOUSE,cgidb.PRPTITEMKIND,cgidb.PRPTLIMIT,cgidb.PRPTMAIN,cgidb.PRPTMAINLOAN,cgidb.PRPTMAINPROP,cgidb.PRPTPLAN,cgidb.prpclimit,cgidb.prppcoinsdetail,cgidb.prpcommission,cgidb.prptmainagri,crmsdb.crms_abs_credit_report_req,crmsdb.crms_abs_credit_report_res,crmsdb.crms_abs_finance_choose_plan,crmsdb.crms_abs_finance_derive_repayment_plan,crmsdb.crms_abs_finance_detail_add,crmsdb.crms_abs_finance_gather_repayment_plan,crmsdb.crms_abs_finance_linkman,crmsdb.crms_abs_finance_pay_repayment,crmsdb.crms_abs_finance_pay_settle,crmsdb.crms_abs_finance_repayment,crmsdb.crms_abs_finance_score,crmsdb.crms_busi_type,crmsdb.crms_enum_categorys,crmsdb.crms_enums,crmsdb.crms_org_role,crmsdb.crms_organ,crmsdb.crms_product,crmsdb.crms_product_plan,crmsdb.crms_role_mapping,crmsdb.crms_role_type,crmsdb.crms_trans_abs_financedetail_req,crmsdb.crms_trans_abs_financedetail_res,crmsdb.crms_trans_abs_financepackage_req,crmsdb.crms_trans_abs_financepackage_res,crmsdb.crms_trans_abs_lend_confirm_req,crmsdb.crms_trans_abs_lend_confirm_req_repayment_plan,crmsdb.crms_trans_abs_lend_confirm_res,crmsdb.crms_trans_abs_repayment_notice_req,crmsdb.crms_trans_abs_repayment_notice_res,crmsdb.crms_trans_compensatory_notify_req,crmsdb.crms_trans_compensatory_notify_res,crmsdb.crms_trans_pay_repayment_notice_req,crmsdb.crms_trans_pay_repayment_notice_res,crmsdb.crms_trans_pay_settle_notice_req,crmsdb.crms_trans_pay_settle_notice_res";
        System.out.println(s.split(",").length);
        for (String s1 : s.split(",")) {
            System.out.println(s1);
        }
    }

    @Test
    public void b4(){
        String s="a";
        switch (s){
            case "a":
                System.out.println("a");
                break;
            default:
                System.out.println("b");
        }
    }


    @Test
    public void b2() {
        String s = "e110_test1_20170419164828.txt.1492681491771.txt";
        System.out.println(s.split(".txt")[0].split("_")[1]);
    }

    @Test
    public void aa() {
        Date date = DateUtils.stringToDate("2017-04-20 16:25:00", DateUtils.DATE_TO_STRING_DETAIAL_PATTERN);
        System.out.println(date.getTime());
    }

    @Test
    public void b1() {
        System.out.println(DateUtils.DateToString(new Date(1492676700000L), DateUtils.DATE_TO_STRING_DETAIAL_PATTERN));
    }

    @Test
    public void a1() {
        String s = "als.user_info,als.impower_to_user,als.customer_belong,als.customer_contacts,als.customer_special,als.customer_info,als.customer_relative,als.customer_partner,als.ent_info,als.ind_info,als.insure_loan_paymen_plan,als.insured_list,als.insure_special_agreement,als.insure_payment_plan,als.flow_record,als.insuretype,als.insure_message,als.business_type,als.business_typeset,als.policy_request,als.assetlist,als.guaranty_info,als.business_apply,als.business_contract,als.org_info,als.acct_payment_log,als.guaranty_contract,als.acct_trans_payment,als.loan_info,als.insuranceman_info,als.insured_info,als.project_info,als.cms_collateraltype_info,als.insure_info,als.acct_payment_schedule,als.acct_loan,als.acct_loan_change,als.acct_ahead,als.user_list,als.business_return,als.fund_strench_people,als.fee_infomation,als.customer_creditmmm\n";
        Arrays.asList(s.split(","))
                .forEach(f -> System.out.println(f));
    }
}
