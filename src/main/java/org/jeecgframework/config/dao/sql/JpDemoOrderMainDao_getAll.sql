SELECT * FROM jp_demo_order_main jdom where 1=1
<#if ( sql )?? && sql ?length gt 0>
	and (${sql})
</#if>