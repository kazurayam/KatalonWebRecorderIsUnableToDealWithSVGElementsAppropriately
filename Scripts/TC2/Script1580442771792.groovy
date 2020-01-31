
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.highcharts.com/demo/line-basic')

WebUI.click(findTestObject('Object Repository/Page_Basic line  Highcharts/tspan_Installation - manually modified'))

WebUI.delay(5)

WebUI.closeBrowser()
