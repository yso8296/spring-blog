package workbook.ex.service;

import workbook.ex.dto.PageRequestDTO;
import workbook.ex.dto.PageResponseDTO;
import workbook.ex.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void modify(ReplyDTO replyDTO);

    void remove(Long rno);

    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
