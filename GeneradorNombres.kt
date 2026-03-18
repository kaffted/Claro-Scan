import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun generarNombreIntuitivo(): String {
    val sdf = SimpleDateFormat("dd_MM_yyyy_hh_mm_a", Locale.getDefault())
    return "scan_${sdf.format(Date()).lowercase()}"
}
