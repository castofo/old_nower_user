package castofo_nower.com.co.nower.models;

import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapData {

    public static Map<Marker, Branch> branchesMap = new HashMap<>();
    public static Map<Integer, ArrayList<Promo>> promosMap = new HashMap<>();
    public static Map<Integer, Branch> detailedBranchesMap = new HashMap<>();
    public static Map<Integer, Promo> detailedPromosMap = new HashMap<>();

    public static Map<Integer, String> promosDescriptionsMap = new HashMap<>();
    public static Map<Integer, String> promosTermsMap = new HashMap<>();

    public static void setBranchesMap(Map<Marker, Branch> branchesMapToSet) {
        for(Map.Entry<Marker, Branch> markerBranch : branchesMapToSet.entrySet()){
            branchesMap.put(markerBranch.getKey(), markerBranch.getValue());
        }
    }

    public static void setPromosMap(Map<Integer, ArrayList<Promo>> promosMapToSet) {
        for(Map.Entry<Integer, ArrayList<Promo>> branchPromosMap : promosMapToSet.entrySet()){
            promosMap.put(branchPromosMap.getKey(), branchPromosMap.getValue());
        }
    }

    public static void setDetailedBranchesMap(Map<Integer, Branch> detailedBranchesMapToSet) {
        for(Map.Entry<Integer, Branch> detailedBranch : detailedBranchesMapToSet.entrySet()){
            detailedBranchesMap.put(detailedBranch.getKey(),detailedBranch.getValue());
        }
    }

    public static void setDetailedPromosMap(Map<Integer, Promo> detailedPromosMapToSet) {
        for(Map.Entry<Integer, Promo> detailedPromo : detailedPromosMapToSet.entrySet()){
            detailedPromosMap.put(detailedPromo.getKey(), detailedPromo.getValue());
        }
    }

    public static void setPromosDescriptionsMap(Map<Integer, String> promosDescriptionsMapToSet) {
        for(Map.Entry<Integer, String> promoDescription : promosDescriptionsMapToSet.entrySet()){
            promosDescriptionsMap.put(promoDescription.getKey(), promoDescription.getValue());
        }
    }

    public static void setPromosTermsMap(Map<Integer, String> promosTermsMapToSet) {
        for(Map.Entry<Integer, String> promoTerms : promosTermsMapToSet.entrySet()){
            promosTermsMap.put(promoTerms.getKey(), promoTerms.getValue());
        }
    }

    public static Branch getBranch(Marker marker) {
        return branchesMap.get(marker);
    }

    public static ArrayList<Promo> getPromoList(int branchId) {
        return promosMap.get(branchId);
    }

    public static Branch getBranchById(int branchId) {
        return detailedBranchesMap.get(branchId);
    }

    public static Promo getPromo(int promoId) {
        return detailedPromosMap.get(promoId);
    }

    public static String getDescription(int id) {
        return promosDescriptionsMap.get(id);
    }

    public static String getTerms(int id) {
        return promosTermsMap.get(id);
    }

    public static void clearBranchesMap() {
        branchesMap.clear();
    }

    public static void clearPromosMap() {
        promosMap.clear();
    }

    public static void clearDetailedBranchesMap() {
        detailedBranchesMap.clear();
    }

    public static void clearDetailedPromosMap() {
        detailedPromosMap.clear();
    }
}
