package com.android.mapper;

import com.android.pojo.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {
    //@Insert("insert into tb_message VALUES (null, #{senderId}, #{message}, #{receiverId}, #{sendTime}, #{postId}, #{chatGroup})")
    void add(Message message);

    @Select("SELECT chatGroup FROM `tb_message` WHERE senderId = #{uid} or receiverId = #{uid} GROUP BY chatGroup")
    List<String> selectAll_chatGroup(int uid);

    @Select("SELECT * FROM `tb_message` WHERE chatGroup = #{chatGroup}")
    List<Message> selectAll_message(String chatGroup);
}
