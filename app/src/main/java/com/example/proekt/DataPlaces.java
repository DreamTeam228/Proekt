package com.example.proekt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONObject;

public class DataPlaces
{
    Place place;
    String json_string;
    JSONObject jsonobject;
    JSONArray jsonArray;
    DataPlaces()
    {
        this.json_string = "";
    }

    public String getInfo(String Json_string) {
        try {
            jsonobject = new JSONObject(Json_string);
            jsonArray = jsonobject.getJSONArray("places");
            int count = 0;
            String description = "", location = "", name = "", picture = "", price = "", time = "";
            while (count < jsonArray.length()) {
                JSONObject Jsonchik = jsonArray.getJSONObject(count);
                description = Jsonchik.getString("description");
                location = Jsonchik.getString("location");
                name = Jsonchik.getString("name");
                picture = Jsonchik.getString("picture");
                price = Jsonchik.getString("price");
                time = Jsonchik.getString("time");
                count++;
            }
            place = new Place(description, location, name, picture, price, time);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return place.ShowInfo(place);
    }
}
