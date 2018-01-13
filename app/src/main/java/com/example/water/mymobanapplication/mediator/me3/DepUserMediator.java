package com.example.water.mymobanapplication.mediator.me3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by water on 2018/1/13.
 */

public class DepUserMediator {
    private static DepUserMediator mInstance=new DepUserMediator();

    private DepUserMediator(){
        Init();
    }

    public static DepUserMediator getmInstance(){
        return mInstance;
    }
    private Collection<UserModel> mUserModels=new ArrayList<>();


    private void Init(){
        UserModel userModel1=new UserModel("U01","DEP01","01");

        UserModel userModel2=new UserModel("U02","DEP01","02");

        UserModel userModel3=new UserModel("U03","DEP02","03");
        UserModel userModel4=new UserModel("U04","DEP02","04");

        UserModel userModel5=new UserModel("U05","DEP02","05");
        mUserModels.add(userModel1);
        mUserModels.add(userModel2);
        mUserModels.add(userModel3);
        mUserModels.add(userModel4);
        mUserModels.add(userModel5);


    }


    public void deleteDep(String depId){
         Collection<UserModel> ums=new ArrayList<>();
         for (UserModel userModel:mUserModels){
             if(userModel.getDepid().equals(depId)){
                 ums.add(userModel);
             }
         }
         mUserModels.removeAll(ums);
    }

    public void deleteUser(String userid){
        Collection<UserModel> ums=new ArrayList<>();
        for (UserModel userModel:mUserModels){
            if(userModel.getId().equals(userid)){


                System.out.println("aadd"+userModel);
                ums.add(userModel);
            }
        }
        mUserModels.removeAll(ums);

    }

    public void showUserDeps(){
        for (UserModel userModel:mUserModels){
            System.out.println(userModel);
        }
    }
}
