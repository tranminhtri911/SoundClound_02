package com.framgia.soundcloud_2.utils;

import com.framgia.soundcloud_2.BuildConfig;
import com.framgia.soundcloud_2.R;

public class Constant {
    public static final int REQUEST_EXTERNAL_STORAGE = 1;
    public static final String CHECK_MUSIC = "!= 0";
    public static final String SORT_MUSIC = " ASC";
    public static class ResourceImage {
        public static int[] IMAGE_CATEGORY = {
            R.drawable.ic_altinaterock,
            R.drawable.ic_ambient,
            R.drawable.ic_classical,
            R.drawable.ic_country,
            R.drawable.ic_dance_edm,
            R.drawable.ic_dance_hall,
            R.drawable.ic_deep_house,
            R.drawable.ic_disco,
            R.drawable.ic_drum_bass,
            R.drawable.ic_dubstep,
            R.drawable.ic_electronic,
            R.drawable.ic_folk_singer,
            R.drawable.ic_hiphop_rap,
            R.drawable.ic_house,
            R.drawable.ic_indie,
            R.drawable.ic_jazz_blues,
            R.drawable.ic_latin,
            R.drawable.ic_metal,
            R.drawable.ic_piano,
            R.drawable.ic_pop,
            R.drawable.ic_rb_soul,
            R.drawable.ic_reggae,
            R.drawable.ic_rock,
            R.drawable.ic_sound_track,
            R.drawable.ic_trance,
            R.drawable.ic_world,
            R.drawable.ic_audio_book,
            R.drawable.ic_business,
            R.drawable.ic_comedy,
            R.drawable.ic_entertainment,
            R.drawable.ic_learning,
            R.drawable.ic_new_bolic,
            R.drawable.ic_religion,
            R.drawable.ic_science,
            R.drawable.ic_sports,
            R.drawable.ic_story,
            R.drawable.ic_technology
        };
    }

    public static class KeyIntent {
        public static final String EXTRA_CATEGORY = "category";
    }

    public static class ConstantApi {
        public static final String URL_SOUNDCLOUD = "https://api-v2.soundcloud.com/";
        public static final String PATH_SONG = "charts";
        public static final String PARAM_CLIENT_ID = "client_id";
        public static final String PARAM_GENRE = "genre";
        public static final String PARAM_KIND = "kind";
        public static final String VALUE_KIND_TOP = "top";
        public static final String PARAM_LIMIT = "limit";
        public static final String VALUE_LIMIT = "50";
        public static final String STREAM_URL = "/stream?client_id" + "=" + BuildConfig.API_KEY;
    }

    public class RequestCode {
        public static final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE = 1;
    }
}
