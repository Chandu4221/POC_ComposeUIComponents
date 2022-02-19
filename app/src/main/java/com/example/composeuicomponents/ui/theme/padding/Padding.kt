package com.example.composeuicomponents.ui.theme.padding

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeuicomponents.ui.theme.dimensions.EIGHT
import com.example.composeuicomponents.ui.theme.dimensions.EIGHTY
import com.example.composeuicomponents.ui.theme.dimensions.ELEVEN
import com.example.composeuicomponents.ui.theme.dimensions.FIFTY_SIX
import com.example.composeuicomponents.ui.theme.dimensions.FIFTY_TWO
import com.example.composeuicomponents.ui.theme.dimensions.FIVE
import com.example.composeuicomponents.ui.theme.dimensions.FORTY
import com.example.composeuicomponents.ui.theme.dimensions.FORTY_EIGHT
import com.example.composeuicomponents.ui.theme.dimensions.FORTY_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.FOUR
import com.example.composeuicomponents.ui.theme.dimensions.FOURTEEN
import com.example.composeuicomponents.ui.theme.dimensions.NINE
import com.example.composeuicomponents.ui.theme.dimensions.NINETY_SIX
import com.example.composeuicomponents.ui.theme.dimensions.ONE
import com.example.composeuicomponents.ui.theme.dimensions.ONE_DP
import com.example.composeuicomponents.ui.theme.dimensions.ONE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.SEVEN
import com.example.composeuicomponents.ui.theme.dimensions.SEVENTY_TWO
import com.example.composeuicomponents.ui.theme.dimensions.SIX
import com.example.composeuicomponents.ui.theme.dimensions.SIXTEEN
import com.example.composeuicomponents.ui.theme.dimensions.SIXTY_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.TEN
import com.example.composeuicomponents.ui.theme.dimensions.THIRTY_SIX
import com.example.composeuicomponents.ui.theme.dimensions.THIRTY_TWO
import com.example.composeuicomponents.ui.theme.dimensions.THREE
import com.example.composeuicomponents.ui.theme.dimensions.THREE_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.TWELVE
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY_EIGHT
import com.example.composeuicomponents.ui.theme.dimensions.TWENTY_FOUR
import com.example.composeuicomponents.ui.theme.dimensions.TWO
import com.example.composeuicomponents.ui.theme.dimensions.TWO_POINT_FIVE
import com.example.composeuicomponents.ui.theme.dimensions.ZERO
import com.example.composeuicomponents.ui.theme.dimensions.ZERO_POINT_FIVE

data class P(
    // ------ ALL SIDES --------
    val p0: Modifier = Modifier.padding(ZERO.dp),
    val pDp: Modifier = Modifier.padding(ONE_DP.dp),
    val p0_5: Modifier = Modifier.padding(ZERO_POINT_FIVE.dp),
    val p1: Modifier = Modifier.padding(ONE.dp),
    val p1_5: Modifier = Modifier.padding(ONE_POINT_FIVE.dp),
    val p2: Modifier = Modifier.padding(TWO.dp),
    val p2_5: Modifier = Modifier.padding(TWO_POINT_FIVE.dp),
    val p3: Modifier = Modifier.padding(THREE.dp),
    val p3_5: Modifier = Modifier.padding(THREE_POINT_FIVE.dp),
    val p4: Modifier = Modifier.padding(FOUR.dp),
    val p5: Modifier = Modifier.padding(FIVE.dp),
    val p6: Modifier = Modifier.padding(SIX.dp),
    val p7: Modifier = Modifier.padding(SEVEN.dp),
    val p8: Modifier = Modifier.padding(EIGHT.dp),
    val p9: Modifier = Modifier.padding(NINE.dp),
    val p10: Modifier = Modifier.padding(TEN.dp),
    val p11: Modifier = Modifier.padding(ELEVEN.dp),
    val p12: Modifier = Modifier.padding(TWELVE.dp),
    val p14: Modifier = Modifier.padding(FOURTEEN.dp),
    val p16: Modifier = Modifier.padding(SIXTEEN.dp),
    val p20: Modifier = Modifier.padding(TWENTY.dp),
    val p24: Modifier = Modifier.padding(TWENTY_FOUR.dp),
    val p28: Modifier = Modifier.padding(TWENTY_EIGHT.dp),
    val p32: Modifier = Modifier.padding(THIRTY_TWO.dp),
    val p36: Modifier = Modifier.padding(THIRTY_SIX.dp),
    val p40: Modifier = Modifier.padding(FORTY.dp),
    val p44: Modifier = Modifier.padding(FORTY_FOUR.dp),
    val p48: Modifier = Modifier.padding(FORTY_EIGHT.dp),
    val p52: Modifier = Modifier.padding(FIFTY_TWO.dp),
    val p56: Modifier = Modifier.padding(FIFTY_SIX.dp),
    val p60: Modifier = Modifier.padding(SIX.dp),
    val p64: Modifier = Modifier.padding(SIXTY_FOUR.dp),
    val p72: Modifier = Modifier.padding(SEVENTY_TWO.dp),
    val p80: Modifier = Modifier.padding(EIGHTY.dp),
    val p96: Modifier = Modifier.padding(NINETY_SIX.dp),

    // ------ HORIZONTAL ------------
    val px0: Modifier = Modifier.padding(horizontal = ZERO.dp),
    val pxDp: Modifier = Modifier.padding(horizontal = ONE_DP.dp),
    val px0_5: Modifier = Modifier.padding(horizontal = ZERO_POINT_FIVE.dp),
    val px1: Modifier = Modifier.padding(horizontal = ONE.dp),
    val px1_5: Modifier = Modifier.padding(horizontal = ONE_POINT_FIVE.dp),
    val px2: Modifier = Modifier.padding(horizontal = TWO.dp),
    val px2_5: Modifier = Modifier.padding(horizontal = TWO_POINT_FIVE.dp),
    val px3: Modifier = Modifier.padding(horizontal = THREE.dp),
    val px3_5: Modifier = Modifier.padding(horizontal = THREE_POINT_FIVE.dp),
    val px4: Modifier = Modifier.padding(horizontal = FOUR.dp),
    val px5: Modifier = Modifier.padding(horizontal = FIVE.dp),
    val px6: Modifier = Modifier.padding(horizontal = SIX.dp),
    val px7: Modifier = Modifier.padding(horizontal = SEVEN.dp),
    val px8: Modifier = Modifier.padding(horizontal = EIGHT.dp),
    val px9: Modifier = Modifier.padding(horizontal = NINE.dp),
    val px10: Modifier = Modifier.padding(horizontal = TEN.dp),
    val px11: Modifier = Modifier.padding(horizontal = ELEVEN.dp),
    val px12: Modifier = Modifier.padding(horizontal = TWELVE.dp),
    val px14: Modifier = Modifier.padding(horizontal = FOURTEEN.dp),
    val px16: Modifier = Modifier.padding(horizontal = SIXTEEN.dp),
    val px20: Modifier = Modifier.padding(horizontal = TWENTY.dp),
    val px24: Modifier = Modifier.padding(horizontal = TWENTY_FOUR.dp),
    val px28: Modifier = Modifier.padding(horizontal = TWENTY_EIGHT.dp),
    val px32: Modifier = Modifier.padding(horizontal = THIRTY_TWO.dp),
    val px36: Modifier = Modifier.padding(horizontal = THIRTY_SIX.dp),
    val px40: Modifier = Modifier.padding(horizontal = FORTY.dp),
    val px44: Modifier = Modifier.padding(horizontal = FORTY_FOUR.dp),
    val px48: Modifier = Modifier.padding(horizontal = FORTY_EIGHT.dp),
    val px52: Modifier = Modifier.padding(horizontal = FIFTY_TWO.dp),
    val px56: Modifier = Modifier.padding(horizontal = FIFTY_SIX.dp),
    val px60: Modifier = Modifier.padding(horizontal = SIX.dp),
    val px64: Modifier = Modifier.padding(horizontal = SIXTY_FOUR.dp),
    val px72: Modifier = Modifier.padding(horizontal = SEVENTY_TWO.dp),
    val px80: Modifier = Modifier.padding(horizontal = EIGHTY.dp),
    val px96: Modifier = Modifier.padding(horizontal = NINETY_SIX.dp),

    // ------ VERTICAL ------------
    val py0: Modifier = Modifier.padding(vertical = ZERO.dp),
    val pyDp: Modifier = Modifier.padding(vertical = ONE_DP.dp),
    val py0_5: Modifier = Modifier.padding(vertical = ZERO_POINT_FIVE.dp),
    val py1: Modifier = Modifier.padding(vertical = ONE.dp),
    val py1_5: Modifier = Modifier.padding(vertical = ONE_POINT_FIVE.dp),
    val py2: Modifier = Modifier.padding(vertical = TWO.dp),
    val py2_5: Modifier = Modifier.padding(vertical = TWO_POINT_FIVE.dp),
    val py3: Modifier = Modifier.padding(vertical = THREE.dp),
    val py3_5: Modifier = Modifier.padding(vertical = THREE_POINT_FIVE.dp),
    val py4: Modifier = Modifier.padding(vertical = FOUR.dp),
    val py5: Modifier = Modifier.padding(vertical = FIVE.dp),
    val py6: Modifier = Modifier.padding(vertical = SIX.dp),
    val py7: Modifier = Modifier.padding(vertical = SEVEN.dp),
    val py8: Modifier = Modifier.padding(vertical = EIGHT.dp),
    val py9: Modifier = Modifier.padding(vertical = NINE.dp),
    val py10: Modifier = Modifier.padding(vertical = TEN.dp),
    val py11: Modifier = Modifier.padding(vertical = ELEVEN.dp),
    val py12: Modifier = Modifier.padding(vertical = TWELVE.dp),
    val py14: Modifier = Modifier.padding(vertical = FOURTEEN.dp),
    val py16: Modifier = Modifier.padding(vertical = SIXTEEN.dp),
    val py20: Modifier = Modifier.padding(vertical = TWENTY.dp),
    val py24: Modifier = Modifier.padding(vertical = TWENTY_FOUR.dp),
    val py28: Modifier = Modifier.padding(vertical = TWENTY_EIGHT.dp),
    val py32: Modifier = Modifier.padding(vertical = THIRTY_TWO.dp),
    val py36: Modifier = Modifier.padding(vertical = THIRTY_SIX.dp),
    val py40: Modifier = Modifier.padding(vertical = FORTY.dp),
    val py44: Modifier = Modifier.padding(vertical = FORTY_FOUR.dp),
    val py48: Modifier = Modifier.padding(vertical = FORTY_EIGHT.dp),
    val py52: Modifier = Modifier.padding(vertical = FIFTY_TWO.dp),
    val py56: Modifier = Modifier.padding(vertical = FIFTY_SIX.dp),
    val py60: Modifier = Modifier.padding(vertical = SIX.dp),
    val py64: Modifier = Modifier.padding(vertical = SIXTY_FOUR.dp),
    val py72: Modifier = Modifier.padding(vertical = SEVENTY_TWO.dp),
    val py80: Modifier = Modifier.padding(vertical = EIGHTY.dp),
    val py96: Modifier = Modifier.padding(vertical = NINETY_SIX.dp),

    // ------ TOP ------------
    val pt0: Modifier = Modifier.padding(top = ZERO.dp),
    val ptDp: Modifier = Modifier.padding(top = ONE_DP.dp),
    val pt0_5: Modifier = Modifier.padding(top = ZERO_POINT_FIVE.dp),
    val pt1: Modifier = Modifier.padding(top = ONE.dp),
    val pt1_5: Modifier = Modifier.padding(top = ONE_POINT_FIVE.dp),
    val pt2: Modifier = Modifier.padding(top = TWO.dp),
    val pt2_5: Modifier = Modifier.padding(top = TWO_POINT_FIVE.dp),
    val pt3: Modifier = Modifier.padding(top = THREE.dp),
    val pt3_5: Modifier = Modifier.padding(top = THREE_POINT_FIVE.dp),
    val pt4: Modifier = Modifier.padding(top = FOUR.dp),
    val pt5: Modifier = Modifier.padding(top = FIVE.dp),
    val pt6: Modifier = Modifier.padding(top = SIX.dp),
    val pt7: Modifier = Modifier.padding(top = SEVEN.dp),
    val pt8: Modifier = Modifier.padding(top = EIGHT.dp),
    val pt9: Modifier = Modifier.padding(top = NINE.dp),
    val pt10: Modifier = Modifier.padding(top = TEN.dp),
    val pt11: Modifier = Modifier.padding(top = ELEVEN.dp),
    val pt12: Modifier = Modifier.padding(top = TWELVE.dp),
    val pt14: Modifier = Modifier.padding(top = FOURTEEN.dp),
    val pt16: Modifier = Modifier.padding(top = SIXTEEN.dp),
    val pt20: Modifier = Modifier.padding(top = TWENTY.dp),
    val pt24: Modifier = Modifier.padding(top = TWENTY_FOUR.dp),
    val pt28: Modifier = Modifier.padding(top = TWENTY_EIGHT.dp),
    val pt32: Modifier = Modifier.padding(top = THIRTY_TWO.dp),
    val pt36: Modifier = Modifier.padding(top = THIRTY_SIX.dp),
    val pt40: Modifier = Modifier.padding(top = FORTY.dp),
    val pt44: Modifier = Modifier.padding(top = FORTY_FOUR.dp),
    val pt48: Modifier = Modifier.padding(top = FORTY_EIGHT.dp),
    val pt52: Modifier = Modifier.padding(top = FIFTY_TWO.dp),
    val pt56: Modifier = Modifier.padding(top = FIFTY_SIX.dp),
    val pt60: Modifier = Modifier.padding(top = SIX.dp),
    val pt64: Modifier = Modifier.padding(top = SIXTY_FOUR.dp),
    val pt72: Modifier = Modifier.padding(top = SEVENTY_TWO.dp),
    val pt80: Modifier = Modifier.padding(top = EIGHTY.dp),
    val pt96: Modifier = Modifier.padding(top = NINETY_SIX.dp),

    // ------ BOTTOM ------------
    val pb0: Modifier = Modifier.padding(bottom = ZERO.dp),
    val pbDp: Modifier = Modifier.padding(bottom = ONE_DP.dp),
    val pb0_5: Modifier = Modifier.padding(bottom = ZERO_POINT_FIVE.dp),
    val pb1: Modifier = Modifier.padding(bottom = ONE.dp),
    val pb1_5: Modifier = Modifier.padding(bottom = ONE_POINT_FIVE.dp),
    val pb2: Modifier = Modifier.padding(bottom = TWO.dp),
    val pb2_5: Modifier = Modifier.padding(bottom = TWO_POINT_FIVE.dp),
    val pb3: Modifier = Modifier.padding(bottom = THREE.dp),
    val pb3_5: Modifier = Modifier.padding(bottom = THREE_POINT_FIVE.dp),
    val pb4: Modifier = Modifier.padding(bottom = FOUR.dp),
    val pb5: Modifier = Modifier.padding(bottom = FIVE.dp),
    val pb6: Modifier = Modifier.padding(bottom = SIX.dp),
    val pb7: Modifier = Modifier.padding(bottom = SEVEN.dp),
    val pb8: Modifier = Modifier.padding(bottom = EIGHT.dp),
    val pb9: Modifier = Modifier.padding(bottom = NINE.dp),
    val pb10: Modifier = Modifier.padding(bottom = TEN.dp),
    val pb11: Modifier = Modifier.padding(bottom = ELEVEN.dp),
    val pb12: Modifier = Modifier.padding(bottom = TWELVE.dp),
    val pb14: Modifier = Modifier.padding(bottom = FOURTEEN.dp),
    val pb16: Modifier = Modifier.padding(bottom = SIXTEEN.dp),
    val pb20: Modifier = Modifier.padding(bottom = TWENTY.dp),
    val pb24: Modifier = Modifier.padding(bottom = TWENTY_FOUR.dp),
    val pb28: Modifier = Modifier.padding(bottom = TWENTY_EIGHT.dp),
    val pb32: Modifier = Modifier.padding(bottom = THIRTY_TWO.dp),
    val pb36: Modifier = Modifier.padding(bottom = THIRTY_SIX.dp),
    val pb40: Modifier = Modifier.padding(bottom = FORTY.dp),
    val pb44: Modifier = Modifier.padding(bottom = FORTY_FOUR.dp),
    val pb48: Modifier = Modifier.padding(bottom = FORTY_EIGHT.dp),
    val pb52: Modifier = Modifier.padding(bottom = FIFTY_TWO.dp),
    val pb56: Modifier = Modifier.padding(bottom = FIFTY_SIX.dp),
    val pb60: Modifier = Modifier.padding(bottom = SIX.dp),
    val pb64: Modifier = Modifier.padding(bottom = SIXTY_FOUR.dp),
    val pb72: Modifier = Modifier.padding(bottom = SEVENTY_TWO.dp),
    val pb80: Modifier = Modifier.padding(bottom = EIGHTY.dp),
    val pb96: Modifier = Modifier.padding(bottom = NINETY_SIX.dp),

    // ------ START ------------
    val ps0: Modifier = Modifier.padding(start = ZERO.dp),
    val psDp: Modifier = Modifier.padding(start = ONE_DP.dp),
    val ps0_5: Modifier = Modifier.padding(start = ZERO_POINT_FIVE.dp),
    val ps1: Modifier = Modifier.padding(start = ONE.dp),
    val ps1_5: Modifier = Modifier.padding(start = ONE_POINT_FIVE.dp),
    val ps2: Modifier = Modifier.padding(start = TWO.dp),
    val ps2_5: Modifier = Modifier.padding(start = TWO_POINT_FIVE.dp),
    val ps3: Modifier = Modifier.padding(start = THREE.dp),
    val ps3_5: Modifier = Modifier.padding(start = THREE_POINT_FIVE.dp),
    val ps4: Modifier = Modifier.padding(start = FOUR.dp),
    val ps5: Modifier = Modifier.padding(start = FIVE.dp),
    val ps6: Modifier = Modifier.padding(start = SIX.dp),
    val ps7: Modifier = Modifier.padding(start = SEVEN.dp),
    val ps8: Modifier = Modifier.padding(start = EIGHT.dp),
    val ps9: Modifier = Modifier.padding(start = NINE.dp),
    val ps10: Modifier = Modifier.padding(start = TEN.dp),
    val ps11: Modifier = Modifier.padding(start = ELEVEN.dp),
    val ps12: Modifier = Modifier.padding(start = TWELVE.dp),
    val ps14: Modifier = Modifier.padding(start = FOURTEEN.dp),
    val ps16: Modifier = Modifier.padding(start = SIXTEEN.dp),
    val ps20: Modifier = Modifier.padding(start = TWENTY.dp),
    val ps24: Modifier = Modifier.padding(start = TWENTY_FOUR.dp),
    val ps28: Modifier = Modifier.padding(start = TWENTY_EIGHT.dp),
    val ps32: Modifier = Modifier.padding(start = THIRTY_TWO.dp),
    val ps36: Modifier = Modifier.padding(start = THIRTY_SIX.dp),
    val ps40: Modifier = Modifier.padding(start = FORTY.dp),
    val ps44: Modifier = Modifier.padding(start = FORTY_FOUR.dp),
    val ps48: Modifier = Modifier.padding(start = FORTY_EIGHT.dp),
    val ps52: Modifier = Modifier.padding(start = FIFTY_TWO.dp),
    val ps56: Modifier = Modifier.padding(start = FIFTY_SIX.dp),
    val ps60: Modifier = Modifier.padding(start = SIX.dp),
    val ps64: Modifier = Modifier.padding(start = SIXTY_FOUR.dp),
    val ps72: Modifier = Modifier.padding(start = SEVENTY_TWO.dp),
    val ps80: Modifier = Modifier.padding(start = EIGHTY.dp),
    val ps96: Modifier = Modifier.padding(start = NINETY_SIX.dp),

    // ------ END ------------
    val pe0: Modifier = Modifier.padding(end = ZERO.dp),
    val peDp: Modifier = Modifier.padding(end = ONE_DP.dp),
    val pe0_5: Modifier = Modifier.padding(end = ZERO_POINT_FIVE.dp),
    val pe1: Modifier = Modifier.padding(end = ONE.dp),
    val pe1_5: Modifier = Modifier.padding(end = ONE_POINT_FIVE.dp),
    val pe2: Modifier = Modifier.padding(end = TWO.dp),
    val pe2_5: Modifier = Modifier.padding(end = TWO_POINT_FIVE.dp),
    val pe3: Modifier = Modifier.padding(end = THREE.dp),
    val pe3_5: Modifier = Modifier.padding(end = THREE_POINT_FIVE.dp),
    val pe4: Modifier = Modifier.padding(end = FOUR.dp),
    val pe5: Modifier = Modifier.padding(end = FIVE.dp),
    val pe6: Modifier = Modifier.padding(end = SIX.dp),
    val pe7: Modifier = Modifier.padding(end = SEVEN.dp),
    val pe8: Modifier = Modifier.padding(end = EIGHT.dp),
    val pe9: Modifier = Modifier.padding(end = NINE.dp),
    val pe10: Modifier = Modifier.padding(end = TEN.dp),
    val pe11: Modifier = Modifier.padding(end = ELEVEN.dp),
    val pe12: Modifier = Modifier.padding(end = TWELVE.dp),
    val pe14: Modifier = Modifier.padding(end = FOURTEEN.dp),
    val pe16: Modifier = Modifier.padding(end = SIXTEEN.dp),
    val pe20: Modifier = Modifier.padding(end = TWENTY.dp),
    val pe24: Modifier = Modifier.padding(end = TWENTY_FOUR.dp),
    val pe28: Modifier = Modifier.padding(end = TWENTY_EIGHT.dp),
    val pe32: Modifier = Modifier.padding(end = THIRTY_TWO.dp),
    val pe36: Modifier = Modifier.padding(end = THIRTY_SIX.dp),
    val pe40: Modifier = Modifier.padding(end = FORTY.dp),
    val pe44: Modifier = Modifier.padding(end = FORTY_FOUR.dp),
    val pe48: Modifier = Modifier.padding(end = FORTY_EIGHT.dp),
    val pe52: Modifier = Modifier.padding(end = FIFTY_TWO.dp),
    val pe56: Modifier = Modifier.padding(end = FIFTY_SIX.dp),
    val pe60: Modifier = Modifier.padding(end = SIX.dp),
    val pe64: Modifier = Modifier.padding(end = SIXTY_FOUR.dp),
    val pe72: Modifier = Modifier.padding(end = SEVENTY_TWO.dp),
    val pe80: Modifier = Modifier.padding(end = EIGHTY.dp),
    val pe96: Modifier = Modifier.padding(end = NINETY_SIX.dp),
)

val LocalPadding = compositionLocalOf { P() }

val MaterialTheme.padding: P
    @Composable
    @ReadOnlyComposable
    get() = LocalPadding.current