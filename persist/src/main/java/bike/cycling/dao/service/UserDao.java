package bike.cycling.dao.service;


import bike.cycling.dto.RankInfo;
import bike.cycling.model.User;

import java.util.List;


/**
 * Created by MrH on 2017/4/25.
 */
public interface UserDao{
    List<RankInfo> AllUserRank();
    Long getUserIdByLoginName(String loginName);
    String getUserPassWordByLoginName(String loginName);
    User makePersistent(User entity);
}
