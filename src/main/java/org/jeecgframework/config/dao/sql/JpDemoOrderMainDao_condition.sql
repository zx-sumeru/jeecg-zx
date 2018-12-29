	    <#if ( jpDemoOrderMain.createDt )??>
		    /* CREATE_DT */
			and jdom.CREATE_DT = :jpDemoOrderMain.createDt
		</#if>
		<#if ( jpDemoOrderMain.crtuser )?? && jpDemoOrderMain.crtuser ?length gt 0>
		    /* CRTUSER */
			and jdom.CRTUSER = :jpDemoOrderMain.crtuser 
		</#if>
		<#if ( jpDemoOrderMain.crtuserName )?? && jpDemoOrderMain.crtuserName ?length gt 0>
		    /* CRTUSER_NAME */
			and jdom.CRTUSER_NAME = :jpDemoOrderMain.crtuserName 
		</#if>
	    <#if ( jpDemoOrderMain.delDt )??>
		    /* DEL_DT */
			and jdom.DEL_DT = :jpDemoOrderMain.delDt
		</#if>
		<#if ( jpDemoOrderMain.delflag )?? && jpDemoOrderMain.delflag ?length gt 0>
		    /* DELFLAG */
			and jdom.DELFLAG = :jpDemoOrderMain.delflag 
		</#if>
		<#if ( jpDemoOrderMain.goAllPrice )?? && jpDemoOrderMain.goAllPrice ?length gt 0>
		    /* 总价(不含返款) */
			and jdom.GO_ALL_PRICE = :jpDemoOrderMain.goAllPrice 
		</#if>
		<#if ( jpDemoOrderMain.goContactName )?? && jpDemoOrderMain.goContactName ?length gt 0>
		    /* 联系人 */
			and jdom.GO_CONTACT_NAME = :jpDemoOrderMain.goContactName
		</#if>
		<#if ( jpDemoOrderMain.goContent )?? && jpDemoOrderMain.goContent ?length gt 0>
		    /* 备注 */
			and jdom.GO_CONTENT = :jpDemoOrderMain.goContent 
		</#if>
		<#if ( jpDemoOrderMain.goOrderCode )?? && jpDemoOrderMain.goOrderCode ?length gt 0>
		    /* 订单号 */
			and jdom.GO_ORDER_CODE = :jpDemoOrderMain.goOrderCode 
		</#if>
		<#if ( jpDemoOrderMain.goOrderCount )?? && jpDemoOrderMain.goOrderCount ?length gt 0>
		    /* 订单人数 */
			and jdom.GO_ORDER_COUNT = :jpDemoOrderMain.goOrderCount 
		</#if>
		<#if ( jpDemoOrderMain.goReturnPrice )?? && jpDemoOrderMain.goReturnPrice ?length gt 0>
		    /* 返款 */
			and jdom.GO_RETURN_PRICE = :jpDemoOrderMain.goReturnPrice
		</#if>
		<#if ( jpDemoOrderMain.goTelphone )?? && jpDemoOrderMain.goTelphone ?length gt 0>
		    /* 手机 */
			and jdom.GO_TELPHONE = :jpDemoOrderMain.goTelphone 
		</#if>
		<#if ( jpDemoOrderMain.goderType )?? && jpDemoOrderMain.goderType ?length gt 0>
		    /* 订单类型 */
			and jdom.GODER_TYPE = :jpDemoOrderMain.goderType
		</#if>
		<#if ( jpDemoOrderMain.modifier )?? && jpDemoOrderMain.modifier ?length gt 0>
		    /* MODIFIER */
			and jdom.MODIFIER = :jpDemoOrderMain.modifier 
		</#if>
		<#if ( jpDemoOrderMain.modifierName )?? && jpDemoOrderMain.modifierName ?length gt 0>
		    /* MODIFIER_NAME */
			and jdom.MODIFIER_NAME = :jpDemoOrderMain.modifierName  
		</#if>
	    <#if ( jpDemoOrderMain.modifyDt )??>
		    /* MODIFY_DT */
			and jdom.MODIFY_DT = :jpDemoOrderMain.modifyDt
		</#if>
		<#if ( jpDemoOrderMain.usertype )?? && jpDemoOrderMain.usertype ?length gt 0>
		    /* 顾客类型 : 1直客 2同行 */
			and jdom.USERTYPE = :jpDemoOrderMain.usertype 
		</#if>
