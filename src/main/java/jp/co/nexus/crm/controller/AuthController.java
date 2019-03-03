package jp.co.nexus.crm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.nexus.crm.facade.CustomersFacade;
import jp.co.nexus.crm.form.SearchForm;

/**
 * 顧客情報絞込検索のコントローラ
 * @author jshioya
 *
 */
@Controller
public class AuthController {

	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

	/**
	 * 担当者、社名で検索した顧客情報を顧客一覧画面へ表示
	 * @param form 検索条件の入力情報
	 * @param model SpringFrameworkのモデル
	 * @return 正常/終了時もcustomer_list.jspへ遷移
	 */
	@RequestMapping(value = "/searchCustomer", method = RequestMethod.GET)
	public String doProcess(SearchForm form, Model model) {

		// １．[担当者]の入力データを取得
		String staffCode = form.getStaffCode();
		// 2.[社名]の入力データを取得
		String companyCode = form.getCustomerCode();
		// 3.担当者、社名で絞込検索

		// 顧客テーブルから検索条件のデータを抽出し、画面に表示
		CustomersFacade customerFacade = new CustomersFacade();
		customerFacade.doSearch(model, staffCode, companyCode);

		return "customer_list";
	}

}
