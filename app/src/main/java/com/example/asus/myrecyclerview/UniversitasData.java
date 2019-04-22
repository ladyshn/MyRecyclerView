package com.example.asus.myrecyclerview;

import java.util.ArrayList;

class UniversitasData {
    private static String[][] data = new String[][]{
            {"UNUD", "Universitas Udayana", "https://upload.wikimedia.org/wikipedia/id/thumb/2/2d/Logo-unud-baru.png/220px-Logo-unud-baru.png"},
            {"UI", "Universitas Indonesia", "https://upload.wikimedia.org/wikipedia/id/thumb/9/95/Makara_UI.png/1200px-Makara_UI.png"},
            {"UNPAD", "Universitas Padjadjaran", "http://news.unpad.ac.id/wp-content/uploads/2010/06/logo-unpad1.jpg"},
            {"UNDIP", "Universitas Diponegoro", "https://upload.wikimedia.org/wikipedia/id/8/88/Logo_UNDIP.jpg"},
            {"UNIMED", "Universitas Negeri Medan", "https://image.psikolif.com/wp-content/uploads/2018/10/Logo-UNIMED-Universitas-Negeri-Medan-Original.jpg"},
            {"ITS", "Institut Teknologi Bandung", "https://katamata.files.wordpress.com/2011/12/lambang-its-png-v1.png"},
            {"UB", "Universitas Brawijaya", "https://upload.wikimedia.org/wikipedia/id/0/07/Logo_ub_kemenristek_dikti.jpg"},
            {"USU", "Universitas Udayana", "https://upload.wikimedia.org/wikipedia/id/4/47/Logo_USU.png"},
    };

    static ArrayList<Universitas> getListData(){
        Universitas universitas= null;
        ArrayList<Universitas> list = new ArrayList<>();
        for (String[] aData : data) {
            universitas= new Universitas();
            universitas.setName(aData[0]);
            universitas.setRemarks(aData[1]);
            universitas.setPhoto(aData[2]);

            list.add(universitas);
        }

        return list;
    }
}
