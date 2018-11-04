package java.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.constants.TimeZoneConstants;

import java.io.Serializable;
import java.lang.Cloneable;

public class TimeZone implements Cloneable, Serializable {
    private static Map<String, com.google.gwt.i18n.client.TimeZone> zones = new HashMap<>();

    private static void checkInit() {
        if (zones.isEmpty()) {
            TimeZoneConstants constants = GWT.create(TimeZoneConstants.class);
            com.google.gwt.i18n.client.TimeZone utc = com.google.gwt.i18n.client.TimeZone.createTimeZone(0);

            zones.put("UTC", utc);
            // Commented out below are the timezones for "America/*" - in the future we'll want
            // to make this configurable so that an arbitrary number of these can be enabled or
            // downloaded when the app comes online, but even these few will cause the app output
            // size to bloat by a considerable amount, so all are disabled for now
//            appendZone(constants.americaAdak());
//            appendZone(constants.americaAnchorage());
//            appendZone(constants.americaAnguilla());
//            appendZone(constants.americaAntigua());
//            appendZone(constants.americaAraguaina());
//            appendZone(constants.americaArgentinaLaRioja());
//            appendZone(constants.americaArgentinaRioGallegos());
//            appendZone(constants.americaArgentinaSalta());
//            appendZone(constants.americaArgentinaSanJuan());
//            appendZone(constants.americaArgentinaSanLuis());
//            appendZone(constants.americaArgentinaTucuman());
//            appendZone(constants.americaArgentinaUshuaia());
//            appendZone(constants.americaAruba());
//            appendZone(constants.americaAsuncion());
//            appendZone(constants.americaBahia());
//            appendZone(constants.americaBahiaBanderas());
//            appendZone(constants.americaBarbados());
//            appendZone(constants.americaBelem());
//            appendZone(constants.americaBelize());
//            appendZone(constants.americaBlancSablon());
//            appendZone(constants.americaBoaVista());
//            appendZone(constants.americaBogota());
//            appendZone(constants.americaBoise());
//            appendZone(constants.americaBuenosAires());
//            appendZone(constants.americaCambridgeBay());
//            appendZone(constants.americaCampoGrande());
//            appendZone(constants.americaCancun());
//            appendZone(constants.americaCaracas());
//            appendZone(constants.americaCatamarca());
//            appendZone(constants.americaCayenne());
//            appendZone(constants.americaCayman());
//            appendZone(constants.americaChicago());
//            appendZone(constants.americaChihuahua());
//            appendZone(constants.americaCoralHarbour());
//            appendZone(constants.americaCordoba());
//            appendZone(constants.americaCostaRica());
//            appendZone(constants.americaCreston());
//            appendZone(constants.americaCuiaba());
//            appendZone(constants.americaCuracao());
//            appendZone(constants.americaDanmarkshavn());
//            appendZone(constants.americaDawson());
//            appendZone(constants.americaDawsonCreek());
//            appendZone(constants.americaDenver());
//            appendZone(constants.americaDetroit());
//            appendZone(constants.americaDominica());
//            appendZone(constants.americaEdmonton());
//            appendZone(constants.americaEirunepe());
//            appendZone(constants.americaElSalvador());
//            appendZone(constants.americaFortaleza());
//            appendZone(constants.americaGlaceBay());
//            appendZone(constants.americaGodthab());
//            appendZone(constants.americaGooseBay());
//            appendZone(constants.americaGrandTurk());
//            appendZone(constants.americaGrenada());
//            appendZone(constants.americaGuadeloupe());
//            appendZone(constants.americaGuatemala());
//            appendZone(constants.americaGuayaquil());
//            appendZone(constants.americaGuyana());
//            appendZone(constants.americaHalifax());
//            appendZone(constants.americaHavana());
//            appendZone(constants.americaHermosillo());
//            appendZone(constants.americaIndianaKnox());
//            appendZone(constants.americaIndianaMarengo());
//            appendZone(constants.americaIndianaPetersburg());
//            appendZone(constants.americaIndianapolis());
//            appendZone(constants.americaIndianaTellCity());
//            appendZone(constants.americaIndianaVevay());
//            appendZone(constants.americaIndianaVincennes());
//            appendZone(constants.americaIndianaWinamac());
//            appendZone(constants.americaInuvik());
//            appendZone(constants.americaIqaluit());
//            appendZone(constants.americaJamaica());
//            appendZone(constants.americaJujuy());
//            appendZone(constants.americaJuneau());
//            appendZone(constants.americaKentuckyMonticello());
//            appendZone(constants.americaKralendijk());
//            appendZone(constants.americaLaPaz());
//            appendZone(constants.americaLima());
//            appendZone(constants.americaLosAngeles());
//            appendZone(constants.americaLouisville());
//            appendZone(constants.americaLowerPrinces());
//            appendZone(constants.americaMaceio());
//            appendZone(constants.americaManagua());
//            appendZone(constants.americaManaus());
//            appendZone(constants.americaMarigot());
//            appendZone(constants.americaMartinique());
//            appendZone(constants.americaMatamoros());
//            appendZone(constants.americaMazatlan());
//            appendZone(constants.americaMendoza());
//            appendZone(constants.americaMenominee());
//            appendZone(constants.americaMerida());
//            appendZone(constants.americaMetlakatla());
//            appendZone(constants.americaMexicoCity());
//            appendZone(constants.americaMiquelon());
//            appendZone(constants.americaMoncton());
//            appendZone(constants.americaMonterrey());
//            appendZone(constants.americaMontevideo());
//            appendZone(constants.americaMontserrat());
//            appendZone(constants.americaNassau());
//            appendZone(constants.americaNewYork());
//            appendZone(constants.americaNipigon());
//            appendZone(constants.americaNome());
//            appendZone(constants.americaNoronha());
//            appendZone(constants.americaNorthDakotaBeulah());
//            appendZone(constants.americaNorthDakotaCenter());
//            appendZone(constants.americaNorthDakotaNewSalem());
//            appendZone(constants.americaOjinaga());
//            appendZone(constants.americaPanama());
//            appendZone(constants.americaPangnirtung());
//            appendZone(constants.americaParamaribo());
//            appendZone(constants.americaPhoenix());
//            appendZone(constants.americaPortauPrince());
//            appendZone(constants.americaPortofSpain());
//            appendZone(constants.americaPortoVelho());
//            appendZone(constants.americaPuertoRico());
//            appendZone(constants.americaRainyRiver());
//            appendZone(constants.americaRankinInlet());
//            appendZone(constants.americaRecife());
//            appendZone(constants.americaRegina());
//            appendZone(constants.americaResolute());
//            appendZone(constants.americaRioBranco());
//            appendZone(constants.americaSantaIsabel());
//            appendZone(constants.americaSantarem());
//            appendZone(constants.americaSantiago());
//            appendZone(constants.americaSantoDomingo());
//            appendZone(constants.americaSaoPaulo());
//            appendZone(constants.americaScoresbysund());
//            appendZone(constants.americaSitka());
//            appendZone(constants.americaStBarthelemy());
//            appendZone(constants.americaStJohns());
//            appendZone(constants.americaStKitts());
//            appendZone(constants.americaStLucia());
//            appendZone(constants.americaStThomas());
//            appendZone(constants.americaStVincent());
//            appendZone(constants.americaSwiftCurrent());
//            appendZone(constants.americaTegucigalpa());
//            appendZone(constants.americaThule());
//            appendZone(constants.americaThunderBay());
//            appendZone(constants.americaTijuana());
//            appendZone(constants.americaToronto());
//            appendZone(constants.americaTortola());
//            appendZone(constants.americaVancouver());
//            appendZone(constants.americaWhitehorse());
//            appendZone(constants.americaWinnipeg());
//            appendZone(constants.americaYakutat());
//            appendZone(constants.americaYellowknife());
        }
    }

    private static void appendZone(String tzJson) {
        com.google.gwt.i18n.client.TimeZone tz = com.google.gwt.i18n.client.TimeZone.createTimeZone(tzJson);
        zones.put(tz.getID(), tz);
    }

    public static TimeZone getTimeZone(String ID) {
        checkInit();
        com.google.gwt.i18n.client.TimeZone gwtTz = zones.get(ID);
        if (gwtTz == null) {
            return null;
        }
        TimeZone tz = new TimeZone(gwtTz);
        return tz;
    }

    public static TimeZone getDefault() {
        return getTimeZone("UTC")
    }

    private final com.google.gwt.i18n.client.TimeZone gwtTz;
    private String id;
    private int offsetMillis;


    private TimeZone(com.google.gwt.i18n.client.TimeZone gwtTz) {
        this.gwtTz = gwtTz;
        this.id = gwtTz.getID();
        if (this.id.equals("Etc/GMT")) {
            this.id = "UTC";
        }
        this.offsetMillis = - gwtTz.getStandardOffset() * 60 * 1000;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public boolean hasSameRules(TimeZone other) {
        return other.getRawOffset() == getRawOffset();
    }

    public boolean useDaylightTime() {
        return hasTransitions(gwtTz);
    }
    private static native boolean hasTransitions(com.google.gwt.i18n.client.TimeZone gwtTz) /*-{
        return gwtTz.@com.google.gwt.i18n.client.TimeZone::transitionPoints != null;
    }-*/;

    public void setRawOffset(int offsetMillis) {
        this.offsetMillis = offsetMillis;
    }
    public int getRawOffset() {
        return offsetMillis;
    }
    public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
        assert era == 1;
        return getOffset(new Date(year, month, day, dayOfWeek, milliseconds).getTime());
    }
    public int getOffset(long date) {
        return - gwtTz.getOffset(new Date(date)) * 60 * 1000;
    }
}
