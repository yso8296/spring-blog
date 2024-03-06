package workbook.ex.service;

import workbook.ex.dto.MemberJoinDTO;

public interface MemberService {

    static class MidExistException extends Exception {
    }

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException;
}
